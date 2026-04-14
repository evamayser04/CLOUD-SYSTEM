package com.ejemplo;
import java.util.Random;

public class EdgeNode {

    private FogNode fogNode;

    public EdgeNode(FogNode fogNode) {
        this.fogNode = fogNode;
    }

    public void enviarDatos() {

        Random random = new Random();
        int i = 0;

        while (true) {

            double temp = 20 + (40 - 20) * random.nextDouble();
            SensorData dato = new SensorData("Sensor-" + i, temp);

            System.out.println("\nEdge envía: " + dato);

            boolean continuar = fogNode.procesarDato(dato);

            if (!continuar) {
                break;
            }

            i++;
        }
    }
}
