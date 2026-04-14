package com.ejemplo;
import java.util.Random;

public class EdgeNode {

    private FogNode fogNode;

    public EdgeNode(FogNode fogNode) {
        this.fogNode = fogNode;
    }

    public void enviarDatos(int cantidad) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            double temp = 20 + (40 - 20) * random.nextDouble();
            SensorData dato = new SensorData("Sensor-" + i, temp);

            System.out.println("Edge envía: " + dato);

            fogNode.procesarDato(dato);
        }
    }
}
