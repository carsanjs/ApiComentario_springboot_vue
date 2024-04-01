package com.example.ApiClaseEstudianteB1.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiClaseEstudianteB1.Model.UsuarioRegistro;
import com.example.ApiClaseEstudianteB1.Repository.UsuarioRegistroRepo;

@Service
 public class UsuarioRegistroServicios {
     @Autowired
     UsuarioRegistroRepo repo;

    //  registrar usuarios
     public UsuarioRegistro registro_usuario (UsuarioRegistro usuario){
            return repo.save(usuario);
       
    }

    public ArrayList<UsuarioRegistro> SessionLogin (String usuario){
        // try{
          ArrayList<UsuarioRegistro> userlogin =repo.findByUsuario(usuario);
        
          return userlogin;

        //   if(userlogin.)  
        //     return null ;

        //   else
        //     return userlogin;
        // }
        // catch(Exception e){
        //   return null;
        // }
        // }

        }









//    ver todos los usuarios registrados
    // public ArrayList<UsuarioRegistro>Ver_Usuarios_Registrados(UsuarioRegistro usuario){
    //     return(ArrayList<UsuarioRegistro>)repo.findAll();
    // }

    // public ArrayList<UsuarioRegistro>buscarcorreo
 
    // eliminar usuario registrado
    // public boolean eliminar_Usuario_Registrado(Integer id){
    //     if(repo.existsById(id)){
    //         repo.deleteById(id);
    //         System.out.println("Usuario eliminado con exito"); 
    //         return true;
    //     }
    //     else{
    //        System.out.println("No se puede eliminar un usuario que no este registrado"); 
    //        return false;
    //     }
    // }

    
 }
