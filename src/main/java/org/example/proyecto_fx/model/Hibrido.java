package org.example.proyecto_fx.model;

public abstract class Hibrido extends Vehiculo {

    private double capacidadTanque;
    private double capacidadBateria;
    private double autonomiaTotal;
    private double autonomiaElectrica;
    private String tipoHibrido;
    private double rendimientoCombinado;

    public Hibrido(double capacidadTanque, double capacidadBateria, double autonomiaTotal, double autonomiaElectrica,
                   String tipoHibrido, double rendimientoCombinado, String placa, String marca, String modelo, double precio) {
        super(placa, marca, modelo, precio);
        this.capacidadTanque = capacidadTanque;
        this.capacidadBateria = capacidadBateria;
        this.autonomiaTotal = autonomiaTotal;
        this.autonomiaElectrica = autonomiaElectrica;
        this.tipoHibrido = tipoHibrido;
        this.rendimientoCombinado = rendimientoCombinado;
    }

    // Métodos abstractos y Getters/Setters
    public abstract void mostrarCaracteristicas();

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomiaTotal() {
        return autonomiaTotal;
    }

    public void setAutonomiaTotal(double autonomiaTotal) {
        this.autonomiaTotal = autonomiaTotal;
    }

    public double getAutonomiaElectrica() {
        return autonomiaElectrica;
    }

    public void setAutonomiaElectrica(double autonomiaElectrica) {
        this.autonomiaElectrica = autonomiaElectrica;
    }

    public String getTipoHibrido() {
        return tipoHibrido;
    }

    public void setTipoHibrido(String tipoHibrido) {
        this.tipoHibrido = tipoHibrido;
    }

    public double getRendimientoCombinado() {
        return rendimientoCombinado;
    }

    public void setRendimientoCombinado(double rendimientoCombinado) {
        this.rendimientoCombinado = rendimientoCombinado;
    }
}

