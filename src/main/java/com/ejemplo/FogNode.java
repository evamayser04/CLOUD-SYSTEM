package com.ejemplo;

public class FogNode {

    private CloudServer cloudServer;

    public FogNode(CloudServer cloudServer) {
        this.cloudServer = cloudServer;
    }

    public void procesarDato(SensorData dato) {
        System.out.println("Fog recibe: " + dato);

        if (dato.getTemperatura() > 30) {
            System.out.println("⚠️ Temperatura ALTA");
        }

        cloudServer.guardarDato(dato);
    }
}
