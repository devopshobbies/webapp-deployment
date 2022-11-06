package com.mycompany.app;

import com.google.gson.Gson;
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
        elasticValues.add("values.master.replicaCount: 1");
        elasticValues.add("data.replicaCount: 1");
        elasticValues.add("ingest.replicaCount: 1");
        elasticValues.add("coordinating.replicaCount: 1");

        Map mongomanifest = new Gson().fromJson("{\n" +
                "  \"apiVersion\": \"argoproj.io/v1alpha1\",\n" +
                "  \"kind\": \"Application\",\n" +
                "  \"metadata\": {\n" +
                "    \"name\": \"mongodb\",\n" +
                "    \"namespace\": \"default\"\n" +
                "  },\n" +
                "  \"spec\": {\n" +
                "    \"destination\": {\n" +
                "      \"namespace\": \"default\",\n" +
                "      \"server\": \"https://kubernetes.default.svc\"\n" +
                "    },\n" +
                "    \"project\": \"default\",\n" +
                "    \"source\": {\n" +
                "      \"helm\": {\n" +
                "        \"parameters\": null\n" +
                "      },\n" +
                "      \"chart\": \"mongodb\",\n" +
                "      \"repoURL\": \"https://charts.bitnami.com/bitnami\",\n" +
                "      \"targetRevision\": \"13.4.1\"\n" +
                "    },\n" +
                "    \"syncPolicy\": {\n" +
                "      \"automated\": {\n" +
                "        \"prune\": true,\n" +
                "        \"selfHeal\": true\n" +
                "      },\n" +
                "      \"syncOptions\": [\n" +
                "        \"CreateNamespace=true\"\n" +
                "      ]\n" +
                "    }\n" +
                "  }\n" +
                "}", Map.class);





        new KubernetesProvider(this,"kubernetes", KubernetesProviderConfig.builder().configPath("/home/moeid/appwrite-deployment/k8s-infrastructure/kube-config.yml").build());
        WebappInfrastructure infrastructure=new WebappInfrastructure(this,"webapp");
        //infrastructure.elasticSearchDeploy("elasticsearch","19.3.0", elasticValues);
        //infrastructure.nginxIngressControllerDeploy("nginx-ingress-controller","9.3.8",null);
        infrastructure.argocdDeploy("argo-cd","4.3.1",null);
        infrastructure.mongodbDeploy("mongo",mongomanifest);
        //infrastructure.prometheus("kube-prometheus","8.1.11",null);
        // define resources here
    }
}
