package com.example.ApiClaseEstudianteB1.Model;
import org.springframework.data.annotation.Id;

// import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider;

public class UsuarioRegistro {

    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String usuario;
    private String clave;

    public UsuarioRegistro(String id, String nombre, String apellidos, String correo, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }


    
}

