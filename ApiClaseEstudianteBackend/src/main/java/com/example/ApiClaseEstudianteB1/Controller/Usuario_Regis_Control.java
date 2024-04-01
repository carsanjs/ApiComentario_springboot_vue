package com.example.ApiClaseEstudianteB1.Controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiClaseEstudianteB1.Model.UsuarioRegistro;
import com.example.ApiClaseEstudianteB1.Repository.UsuarioRegistroRepo;
import com.example.ApiClaseEstudianteB1.Services.UsuarioRegistroServicios;


@RestController
@RequestMapping("/User")
@CrossOrigin("*")
public class Usuario_Regis_Control {

   @Autowired
   UsuarioRegistroServicios servicio;
   UsuarioRegistroRepo repository;

   // solicitud del servidor
   @PostMapping("/registrarusuario")
   public UsuarioRegistro guardarusuario(@RequestBody UsuarioRegistro usuario) {
      return servicio.registro_usuario(usuario);
   }

   @GetMapping("/Login/{Usuario}")
   public ArrayList<UsuarioRegistro> login (@PathVariable("Usuario") String Usuario){
      return  servicio.SessionLogin(Usuario);
   }
  
    // @GetMapping("lista/usarios")
   // public ArrayList<UsuarioRegistro> listausuario(UsuarioRegistro usuario) {
   //    return servicio.Ver_Usuarios_Registrados(usuario);
   // }

   // @GetMapping(path = "/buscarcorreo/{correo}")
   // public ArrayList<UsuarioRegistro>buscarcorreo(@PathVariable("correo")Integer
   // correo){

   // }

   // @DeleteMapping(path = "eliminar/usuario/{id}")
   // public boolean eliminarUsuario(@PathVariable("id")Integer id) {
   // if(id != null && id != 0 ){
   // return servicio.eliminar_Usuario_Registrado(id);
   // }
   // else{
   // System.out.println("Error al eliminar usuario");
   // return false;
   // }
   // }
}
