package org.example.proyecto_fx.model;

public abstract class Usuario {

    protected String nombre;
    protected String apellido;
    protected String nombreUsuario;
    protected String clave;

    public Usuario(String nombre, String apellido, String nombreUsuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    // Método para iniciar sesión
    public boolean iniciarSesion(String usuario, String clave) {
        return this.nombreUsuario.equals(usuario) && this.clave.equals(clave);
    }

    // Método abstracto que será implementado por las clases que hereden de Usuario
    public abstract void mostrarInformacion();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
