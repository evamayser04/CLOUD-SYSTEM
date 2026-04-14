package com.ejemplo;

public class Main {

    public static void main(String[] args) {

        CloudServer cloud = new CloudServer();
        FogNode fog = new FogNode(cloud);
        EdgeNode edge = new EdgeNode(fog);

        edge.enviarDatos(5);

        cloud.mostrarResumen();
    }
}
