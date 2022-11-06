package com.mycompany.app;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.mycompany.app.stacks.webapp.WebappInfrastructure;
import imports.kubernetes.KubernetesProvider;
import imports.kubernetes.KubernetesProviderConfig;
import software.constructs.Construct;
import com.hashicorp.cdktf.TerraformStack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MainStack extends TerraformStack
{
    public MainStack(final Construct scope, final String id) throws FileNotFoundException {
        super(scope, id);
        List<String> elasticValues=new ArrayList<>();
        elasticValues.add("values.master.replicaCount: 1");
        elasticValues.add("data.replicaCount: 1");
        elasticValues.add("ingest.replicaCount: 1");
        elasticValues.add("coordinating.replicaCount: 1");
        JsonReader reader = new JsonReader(new FileReader("src/main/java/com/mycompany/app/applications/intersectionOverunion.json"));
        Map mongomanifest = new Gson().fromJson(reader, Map.class);
        new KubernetesProvider(this,"kubernetes", KubernetesProviderConfig.builder().configPath("../../../kube-config.yml").build());
        WebappInfrastructure infrastructure=new WebappInfrastructure(this,"webapp");
        infrastructure.elasticSearchDeploy("elasticsearch","19.3.0", elasticValues);
        infrastructure.nginxIngressControllerDeploy("nginx-ingress-controller","9.3.8",null);
        infrastructure.argocdDeploy("argo-cd","4.3.1",null);
        infrastructure.mongodbDeploy("hello-k8s",mongomanifest);
        infrastructure.prometheus("kube-prometheus","8.1.11",null);
    }
}
