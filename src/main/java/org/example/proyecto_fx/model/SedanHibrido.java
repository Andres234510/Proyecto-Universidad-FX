package org.example.proyecto_fx.model;

public class SedanHibrido extends Hibrido {

    private int numPasajeros;
    private double capacidadMaletero;
    private int airbags;
    private double nivelBateria;

    public SedanHibrido(double capacidadTanque, double capacidadBateria, double autonomiaTotal, double autonomiaElectrica,
                        String tipoHibrido, double rendimientoCombinado, String placa, String marca, String modelo, double precio,
                        int numPasajeros, double capacidadMaletero, int airbags) {
        super(capacidadTanque, capacidadBateria, autonomiaTotal, autonomiaElectrica, tipoHibrido, rendimientoCombinado,
                placa, marca, modelo, precio);
        this.numPasajeros = numPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.airbags = airbags;
        this.nivelBateria = 100.0;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("=================================");
        System.out.println("   Características del Sedán Híbrido");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad del Tanque: " + getCapacidadTanque() + " litros");
        System.out.println("Capacidad de la Batería: " + getCapacidadBateria() + " kWh");
        System.out.println("Autonomía Total: " + getAutonomiaTotal() + " km");
        System.out.println("Autonomía Eléctrica: " + getAutonomiaElectrica() + " km");
        System.out.println("Tipo Híbrido: " + getTipoHibrido());
        System.out.println("Rendimiento Combinado: " + getRendimientoCombinado() + " km/l");
        System.out.println("Número de Pasajeros: " + numPasajeros);
        System.out.println("Capacidad del Maletero: " + capacidadMaletero + " litros");
        System.out.println("Número de Airbags: " + airbags);
        System.out.println("Nivel de Batería: " + nivelBateria + "%");
        System.out.println("=================================");
    }

    @Override
    public void aplicarDescuento(double descuento) {

    }

    // Métodos adicionales
    public void cargarBateria(double cantidad) {
        nivelBateria = Math.min(100, nivelBateria + cantidad);
    }

    // Getters y Setters
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}
