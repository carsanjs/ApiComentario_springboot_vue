package com.example.ApiClaseEstudianteB1.Model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class UsuarioComentario {
    
    @Id
    private int idPublicar;
    private String titulo;
    private String escribirRelato;
    private LocalDateTime strDateFormat =LocalDateTime.now();
    private boolean like;
    private boolean idIslike;
    private String comentarioRelato;

    
    public UsuarioComentario(int idPublicar, String titulo, String escribirRelato, LocalDateTime strDateFormat,
            boolean like, boolean idIslike, String comentarioRelato) {
        this.idPublicar = idPublicar;
        this.titulo = titulo;
        this.escribirRelato = escribirRelato;
        this.strDateFormat = strDateFormat;
        this.like = like;
        this.idIslike = idIslike;
        this.comentarioRelato = comentarioRelato;
    }
    public int getIdPublicar() {
        return idPublicar;
    }
    public void setIdPublicar(int idPublicar) {
        this.idPublicar = idPublicar;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEscribirRelato() {
        return escribirRelato;
    }
    public void setEscribirRelato(String escribirRelato) {
        this.escribirRelato = escribirRelato;
    }
    public LocalDateTime getStrDateFormat() {
        return strDateFormat;
    }
    public void setStrDateFormat(LocalDateTime strDateFormat) {
        this.strDateFormat = strDateFormat;
    }
    public boolean isLike() {
        return like;
    }
    public void setLike(boolean like) {
        this.like = like;
    }
    public boolean isIdIslike() {
        return idIslike;
    }
    public void setIdIslike(boolean idIslike) {
        this.idIslike = idIslike;
    }
    public String getComentarioRelato() {
        return comentarioRelato;
    }
    public void setComentarioRelato(String comentarioRelato) {
        this.comentarioRelato = comentarioRelato;
    }
    
    
 
}
