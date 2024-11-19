package org.example.proyecto_fx.model;

public class Cliente extends Usuario {

    private String direccion;
    private String telefono;

    public Cliente(String nombre, String apellido, String nombreUsuario, String clave, String direccion, String telefono) {
        super(nombre, apellido, nombreUsuario, clave);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    // Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
