package com.ejemplo;

public class SensorData {

    private final String sensorId;
    private final double temperatura;

    public SensorData(String sensorId, double temperatura) {
        this.sensorId = sensorId;
        this.temperatura = temperatura;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Sensor: " + sensorId + " | Temperatura: " + temperatura;
    }
}
