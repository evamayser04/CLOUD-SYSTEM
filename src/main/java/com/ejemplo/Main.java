package com.ejemplo;

public class Main {

    public static void main(String[] args) {

        CloudServer cloud = new CloudServer();

        FogNode[] fogs = new FogNode[5];
        EdgeNode[][] edges = new EdgeNode[5][5];

        int orden = 0;

        // crear fogs
        for (int i = 0; i < 5; i++) {
            fogs[i] = new FogNode(cloud, i);

            // crear edges por cada fog
            for (int j = 0; j < 5; j++) {
                edges[i][j] = new EdgeNode(fogs[i], i, j);
            }
        }

        // ENVIAR DATOS EN ORDEN
        for (int ronda = 0; ronda < 3; ronda++) { // puedes cambiar rondas

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {

                    System.out.println("\n Ronda " + orden);
                    edges[i][j].enviarDato();
                    orden++;
                }
            }
        }

        cloud.mostrarResumen();
    }
}
