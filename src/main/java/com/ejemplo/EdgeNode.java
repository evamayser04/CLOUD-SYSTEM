package com.ejemplo;
import java.util.Random;

public class EdgeNode {

    private FogNode fogNode;
    private int id;
    private int fogId;
    private Random random = new Random();

    public EdgeNode(FogNode fogNode, int fogId, int id) {
        this.fogNode = fogNode;
        this.fogId = fogId;
        this.id = id;
    }

    public void enviarDato() {

        double temp = 20 + (40 - 20) * random.nextDouble();

        SensorData dato = new SensorData(
                "Fog-" + fogId + "-Edge-" + id,
                temp
        );

        System.out.println("Edge " + id +
                " (Fog " + fogId + ") -> " + temp);

        fogNode.procesarDato(dato, id);
    }
}
