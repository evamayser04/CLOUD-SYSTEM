package com.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class FogNode {

    private CloudServer cloudServer;
    private int id;
    private List<SensorData> buffer = new ArrayList<>();

    public FogNode(CloudServer cloudServer, int id) {
        this.cloudServer = cloudServer;
        this.id = id;
    }

    public void procesarDato(SensorData dato, int edgeId) {

        System.out.println("Fog " + id +
                " recibe de Edge " + edgeId +
                " -> " + dato);

        buffer.add(dato);

        // cuando hay 5 datos → enviar al cloud
        if (buffer.size() == 5) {

            System.out.println("Fog " + id + " enviando lote de 5 datos al Cloud...");

            // SIMULACIÓN DE TIEMPO
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cloudServer.guardarLote(buffer);

            buffer.clear(); // vaciar buffer
        }
    }
}
