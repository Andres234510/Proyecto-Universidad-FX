package org.example.proyecto_fx.model;

public class Empleado extends Usuario {

    private String puesto;
    private double salario;

    public Empleado(String nombre, String apellido, String nombreUsuario, String clave, String puesto, double salario) {
        super(nombre, apellido, nombreUsuario, clave);
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
    }

    // Getters y Setters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
