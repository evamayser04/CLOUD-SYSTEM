package com.ejemplo;

public class FogNode {

    private CloudServer cloudServer;
    private int id;
    private int contadorAltas = 0;

    public FogNode(CloudServer cloudServer, int id) {
        this.cloudServer = cloudServer;
        this.id = id;
    }

    public boolean procesarDato(SensorData dato, int edgeId) {

        System.out.println("Fog " + id +
                " recibe de Edge " + edgeId +
                " -> " + dato);

        if (dato.getTemperatura() > 30) {
            contadorAltas++;
            System.out.println("⚠️ Fog " + id + " temperatura ALTA (" + contadorAltas + ")");
        }

        cloudServer.guardarDato(dato);

        return true; // no se detiene globalmente en esta versión
    }

    public int getId() {
        return id;
    }
}
