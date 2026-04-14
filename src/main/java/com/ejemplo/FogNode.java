package com.ejemplo;

public class FogNode {

    private CloudServer cloudServer;
    private int contadorAltas = 0;

    public FogNode(CloudServer cloudServer) {
        this.cloudServer = cloudServer;
    }

    // devuelve false cuando llega a 20 altas
    public boolean procesarDato(SensorData dato) {

        System.out.println("Fog recibe: " + dato);

        if (dato.getTemperatura() > 30) {
            contadorAltas++;
            System.out.println("⚠️ Temperatura ALTA (" + contadorAltas + "/20)");
        }

        cloudServer.guardarDato(dato);

        if (contadorAltas >= 20) {
            System.out.println("\n🚨 Se han alcanzado 20 temperaturas altas. PARANDO SISTEMA.");
            return false;
        }

        return true;
    }

    public int getContadorAltas() {
        return contadorAltas;
    }
}
