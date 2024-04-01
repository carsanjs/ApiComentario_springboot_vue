package com.example.ApiClaseEstudianteB1.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiClaseEstudianteB1.Model.UsuarioComentario;
import com.example.ApiClaseEstudianteB1.Repository.UsuarioComentarioRepo;

@Service
public class UsuarioComenatioServicio {
     @Autowired
     UsuarioComentarioRepo repository;

public UsuarioComentario registrarComentario (UsuarioComentario idPublicar){
    return repository.save(idPublicar);
       
}

public ArrayList<UsuarioComentario> consultarComent(){
    try {
        return (ArrayList<UsuarioComentario>)repository.findAll();
    } catch (Exception e) {
        return null;
    }
}

// kpublic Optional<UsuarioComentario> consultarComentId(Integer idPublicar){
//     try {
//         if(!repository.existsById(idPublicar))return null;
//         else return repository.findById(idPublicar);
//     } catch (Exception e) {
//         return null;
//     }
// }

// public boolean eliminarComenario(Integer idPublicar){
//     try {
//         if(repository.existsById(idPublicar)){
//             repository.deleteById(idPublicar);
//             return true;
//         }else return false;
//     } catch (Exception e) {
//         return false;
//     }
// }
    
}
