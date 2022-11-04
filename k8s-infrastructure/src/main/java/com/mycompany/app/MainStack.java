package com.mycompany.app;

import com.mycompany.app.stacks.webapp.WebappInfrastructure;
import imports.kubernetes.KubernetesProvider;
import imports.kubernetes.KubernetesProviderConfig;
import software.constructs.Construct;

import com.hashicorp.cdktf.TerraformStack;

import java.util.*;

public class MainStack extends TerraformStack
{
    public MainStack(final Construct scope, final String id) {
        super(scope, id);

        List<String> elasticValues=new ArrayList<>();
        elasticValues.add("master.replicaCount: 1");
        elasticValues.add("data.replicaCount: 1");
        elasticValues.add("ingest.replicaCount: 1");
        elasticValues.add("coordinating.replicaCount: 1");
        new KubernetesProvider(this,"kubernetes", KubernetesProviderConfig.builder().configPath("/home/moeid/appwrite-deployment/k8s-infrastructure/kube-config.yml").build());
        WebappInfrastructure infrastructure=new WebappInfrastructure(this,"webapp");
        infrastructure.elasticSearchDeploy("elasticsearch","19.3.0", elasticValues);
        infrastructure.nginxIngressControllerDeploy("nginx-ingress-controller","9.3.8",null);
        // define resources here
    }
}