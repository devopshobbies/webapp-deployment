package com.mycompany.app.stacks.webapp;

import com.hashicorp.cdktf.ITerraformDependable;
import com.hashicorp.cdktf.TerraformResource;
import com.mycompany.app.stacks.IInfrastructure;
import imports.helm.*;
import imports.kubernetes.Manifest;
import imports.kubernetes.ManifestConfig;
import software.constructs.Construct;

import java.util.*;


public class WebappInfrastructure implements IInfrastructure {

    private HelmProvider helm;
    Construct construct;
    String name;
    Release argocdRelease;

    public HelmProvider getHelm() {
        return helm;
    }

    public void setHelm(HelmProvider helm) {
        this.helm = helm;
    }

    public Construct getConstruct() {
        return construct;
    }

    public void setConstruct(Construct construct) {
        this.construct = construct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebappInfrastructure(Construct construct, String name){
        this.setConstruct(construct);
        this.setName(name);

        helm=new HelmProvider(this.construct,this.name, HelmProviderConfig.builder().kubernetes(HelmProviderKubernetes.builder().configPath("/home/moeid/appwrite-deployment/k8s-infrastructure/kube-config.yml").build()).build());
    }

    @Override
    public String elasticSearchDeploy(String name,String version, List<String> vars) {
        new Release(construct,name, ReleaseConfig.builder().chart("elasticsearch").version(version).repository("https://charts.bitnami.com/bitnami").name(name).values(vars).build());
        return null;
    }

    @Override
    public String nginxIngressControllerDeploy(String name,String version, List<String> vars) {
        new Release(construct,name, ReleaseConfig.builder().chart("nginx-ingress-controller").version(version).repository("https://charts.bitnami.com/bitnami").values(vars).name(name).build());
        return null;
    }

    @Override
    public String argocdDeploy(String name, String version, List<String> vars) {
        new Release(construct,name, ReleaseConfig.builder().chart("argo-cd").version(version).repository("https://charts.bitnami.com/bitnami").values(vars).name(name).build());
        return null;
    }

    @Override
    public String prometheus(String name, String version, List<String> vars) {

        this.argocdRelease=new Release(construct,name, ReleaseConfig.builder().chart("kube-prometheus").version(version).repository("https://charts.bitnami.com/bitnami").values(vars).name(name).build());
        return null;
    }

    @Override
    public String mongodbDeploy(String name,Map<String, Object> manifest) {
        List<ITerraformDependable> dependencies=new ArrayList<>();
        dependencies.add(this.argocdRelease);
        new Manifest(construct,name,ManifestConfig.builder().manifest(manifest).build());
        return null;
    }

}
