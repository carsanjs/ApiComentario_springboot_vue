package com.example.ApiClaseEstudianteB1.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiClaseEstudianteB1.Model.UsuarioComentario;
import com.example.ApiClaseEstudianteB1.Services.UsuarioComenatioServicio;

@RestController
@RequestMapping("/Comentario")
@CrossOrigin("*")
public class UsuarioComentarioControl {

   @Autowired
    UsuarioComenatioServicio service;
    // UsuarioComentarioRepo repo;


 // solicitud del servidor
 @PostMapping("/guardar")
 public UsuarioComentario guardarcomentario(@RequestBody UsuarioComentario id_Publicar) {
    return service.registrarComentario(id_Publicar);
 
 }
 
 @GetMapping("/ver")
    public ArrayList<UsuarioComentario> VerComentario() {
        return service.consultarComent();
    }

    // @DeleteMapping(value = "/eliminar/{id}")
    // public String eliminarMenu(@PathVariable Integer idPublicar) {
    //     try {
    //         boolean response = service.eliminarComenario(idPublicar);
    //         if (response)
    //             return "{\"success\": true, \"message\": \" eliminado correctamente.\"}";
    //         else
    //             return "{\"success\": false, \"message\": \"No se pudo eliminar el Menu, revisa los parametros.\"}";
    //     } catch (Exception e) {
    //         return "{\"success\": false, \"message\": \"Ocurrio un error al hacer la consulta.\"}";
    //     }
    // }
 
}




