package com.example.ApiClaseEstudianteB1.Repository;


// import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ApiClaseEstudianteB1.Model.UsuarioComentario;

public interface UsuarioComentarioRepo extends MongoRepository<UsuarioComentario,Integer>{
    
      public Optional<UsuarioComentario>findById( Integer idPublicar);
 
}

