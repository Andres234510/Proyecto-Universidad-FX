package org.example.proyecto_fx.model;

public abstract class CombustibleAGas extends Vehiculo {

    private double capacidadTanque;
    private String nivelEmisiones;
    private double potenciaMotor;
    private double rendimiento;
    private TipoCombustible tipoCombustible;

    public CombustibleAGas(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento,
                           TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio) {
        super(placa, marca, modelo, precio);
        this.capacidadTanque = capacidadTanque;
        this.nivelEmisiones = nivelEmisiones;
        this.potenciaMotor = potenciaMotor;
        this.rendimiento = rendimiento;
        this.tipoCombustible = tipoCombustible;
    }

    // Métodos abstractos y Getters/Setters
    public abstract void mostrarCaracteristicas();

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String getNivelEmisiones() {
        return nivelEmisiones;
    }

    public void setNivelEmisiones(String nivelEmisiones) {
        this.nivelEmisiones = nivelEmisiones;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
