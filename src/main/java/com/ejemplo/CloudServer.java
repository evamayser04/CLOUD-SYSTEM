package com.ejemplo;
import java.util.ArrayList;

public class CloudServer {

    private ArrayList<SensorData> datos = new ArrayList<>();

    public void guardarDato(SensorData dato) {
        datos.add(dato);
    }

    public void mostrarResumen() {
        System.out.println("\n--- RESUMEN CLOUD ---");
        for (SensorData d : datos) {
            System.out.println(d);
        }
    }
}
