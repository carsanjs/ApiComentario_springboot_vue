package com.example.ApiClaseEstudianteB1.Repository;
import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.ApiClaseEstudianteB1.Model.UsuarioRegistro;

public interface UsuarioRegistroRepo extends MongoRepository<UsuarioRegistro, String> {

public ArrayList<UsuarioRegistro>findByUsuario(String usuario);

}

