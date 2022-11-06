package com.mycompany.app;

import software.constructs.Construct;

import com.hashicorp.cdktf.App;
import com.hashicorp.cdktf.TerraformStack;

import java.io.FileNotFoundException;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        final App app = new App();
        new MainStack(app, "k8s-infrastructure");
        app.synth();
    }
}
