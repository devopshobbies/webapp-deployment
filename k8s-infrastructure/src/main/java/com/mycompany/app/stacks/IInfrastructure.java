package com.mycompany.app.stacks;

import software.constructs.Construct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IInfrastructure {
    String elasticSearchDeploy(String name,String version, List<String> vars);
    String nginxIngressControllerDeploy(String name,String version, List<String> vars);
    String argocdDeploy(String name,String version, List<String> vars);
    String prometheus(String name,String version,List<String> vars);

    String mongodbDeploy(String name,Map<String,Object> manifest);
}
