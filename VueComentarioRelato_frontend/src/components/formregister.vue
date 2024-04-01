
<template>
    <form id='form' class='form-formulario' action="" >
 <div class="container-formulario for-inicio">   
 <div class='form-group'>
   <div class="input-group mb-2">
     <div class="input-group-prepend">
       <div class="input-group-text">
         <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
        <path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"/>
        </svg>
       </div>
     </div>
     <input 
            type="text" 
            class="form-control" 
            id="nombre"
            v-model="nombre"
            placeholder="Nombre"
            required />
   </div>
   <span v-if="nombre.length > 1">{{valid_nom_msg}}</span>
 </div>
 <div class='form-group'>
   <label for='apellido' class='control-label'>
   </label>
   <div class="input-group mb-2">
     <div class="input-group-prepend">
       <div class="input-group-text">
         <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
<path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"/>
</svg>
       </div>
     </div>
     <input 
            type="text" 
            class="form-control"
            name="apellidos"
            v-model="apellidos" 
            id="apellidos"
            placeholder="Apellido"
            required />
   </div>
   <span v-if="apellidos.length > 1">{{valid_ape_msg}}</span>
 </div>
 <div class='form-group'>
    <!-- {{campo_usuario}} -->
   <div class="input-group mb-2">
     <div class="input-group-prepend">
       <div class="input-group-text">
         <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
          <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
          <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
          </svg>
       </div>
     </div>
     <input 
            type="text" 
            class="form-control" 
            id="usuario"
            name="usuario"
            v-model="usuario"
            placeholder="usuario123"
            required />
   </div>
   <span v-if="usuario.length > 1">{{valid_usu_msg}}</span>
 </div>
 <div class='form-group'>
 <!-- {{campo_email}} -->
   <div class="input-group mb-2">
     <div class="input-group-prepend">
       <div class="input-group-text">
         <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-google" viewBox="0 0 16 16">
         <path d="M15.545 6.558a9.42 9.42 0 0 1 .139 1.626c0 2.434-.87 4.492-2.384 5.885h.002C11.978 15.292 10.158 16 8 16A8 8 0 1 1 8 0a7.689 7.689 0 0 1 5.352 2.082l-2.284 2.284A4.347 4.347 0 0 0 8 3.166c-2.087 0-3.86 1.408-4.492 3.304a4.792 4.792 0 0 0 0 3.063h.003c.635 1.893 2.405 3.301 4.492 3.301 1.078 0 2.004-.276 2.722-.764h-.003a3.702 3.702 0 0 0 1.599-2.431H8v-3.08h7.545z"/>
       </svg>
       </div>
     </div>
     <input 
            type="email" 
            class="form-control" 
            id="correo"
            v-model="correo"
            name="correo"
            placeholder="ComenRelato35@gmail.com"
            required />
   </div>
   <span v-if="correo.length > 1">{{valid_cor_msg}}</span>
 </div>

 <div class='form-group'>
 <!-- {{campo_pass}} -->
   <div class="input-group mb-2">
     <div class="input-group-prepend">
       <div class="input-group-text">
         <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-fingerprint" viewBox="0 0 16 16">
         <path d="M8.06 6.5a.5.5 0 0 1 .5.5v.776a11.5 11.5 0 0 1-.552 3.519l-1.331 4.14a.5.5 0 0 1-.952-.305l1.33-4.141a10.5 10.5 0 0 0 .504-3.213V7a.5.5 0 0 1 .5-.5Z"/>
          <path d="M6.06 7a2 2 0 1 1 4 0 .5.5 0 1 1-1 0 1 1 0 1 0-2 0v.332c0 .409-.022.816-.066 1.221A.5.5 0 0 1 6 8.447c.04-.37.06-.742.06-1.115V7Zm3.509 1a.5.5 0 0 1 .487.513 11.5 11.5 0 0 1-.587 3.339l-1.266 3.8a.5.5 0 0 1-.949-.317l1.267-3.8a10.5 10.5 0 0 0 .535-3.048A.5.5 0 0 1 9.569 8Zm-3.356 2.115a.5.5 0 0 1 .33.626L5.24 14.939a.5.5 0 1 1-.955-.296l1.303-4.199a.5.5 0 0 1 .625-.329Z"/>
          <path d="M4.759 5.833A3.501 3.501 0 0 1 11.559 7a.5.5 0 0 1-1 0 2.5 2.5 0 0 0-4.857-.833.5.5 0 1 1-.943-.334Zm.3 1.67a.5.5 0 0 1 .449.546 10.72 10.72 0 0 1-.4 2.031l-1.222 4.072a.5.5 0 1 1-.958-.287L4.15 9.793a9.72 9.72 0 0 0 .363-1.842.5.5 0 0 1 .546-.449Zm6 .647a.5.5 0 0 1 .5.5c0 1.28-.213 2.552-.632 3.762l-1.09 3.145a.5.5 0 0 1-.944-.327l1.089-3.145c.382-1.105.578-2.266.578-3.435a.5.5 0 0 1 .5-.5Z"/>
          <path d="M3.902 4.222a4.996 4.996 0 0 1 5.202-2.113.5.5 0 0 1-.208.979 3.996 3.996 0 0 0-4.163 1.69.5.5 0 0 1-.831-.556Zm6.72-.955a.5.5 0 0 1 .705-.052A4.99 4.99 0 0 1 13.059 7v1.5a.5.5 0 1 1-1 0V7a3.99 3.99 0 0 0-1.386-3.028.5.5 0 0 1-.051-.705ZM3.68 5.842a.5.5 0 0 1 .422.568c-.029.192-.044.39-.044.59 0 .71-.1 1.417-.298 2.1l-1.14 3.923a.5.5 0 1 1-.96-.279L2.8 8.821A6.531 6.531 0 0 0 3.058 7c0-.25.019-.496.054-.736a.5.5 0 0 1 .568-.422Zm8.882 3.66a.5.5 0 0 1 .456.54c-.084 1-.298 1.986-.64 2.934l-.744 2.068a.5.5 0 0 1-.941-.338l.745-2.07a10.51 10.51 0 0 0 .584-2.678.5.5 0 0 1 .54-.456Z"/>
           <path d="M4.81 1.37A6.5 6.5 0 0 1 14.56 7a.5.5 0 1 1-1 0 5.5 5.5 0 0 0-8.25-4.765.5.5 0 0 1-.5-.865Zm-.89 1.257a.5.5 0 0 1 .04.706A5.478 5.478 0 0 0 2.56 7a.5.5 0 0 1-1 0c0-1.664.626-3.184 1.655-4.333a.5.5 0 0 1 .706-.04ZM1.915 8.02a.5.5 0 0 1 .346.616l-.779 2.767a.5.5 0 1 1-.962-.27l.778-2.767a.5.5 0 0 1 .617-.346Zm12.15.481a.5.5 0 0 1 .49.51c-.03 1.499-.161 3.025-.727 4.533l-.07.187a.5.5 0 0 1-.936-.351l.07-.187c.506-1.35.634-2.74.663-4.202a.5.5 0 0 1 .51-.49Z"/>
          </svg>
       </div>
     </div>
     <input 
            type="password" 
            class="form-control" 
            id="clave"
            name="clave"
            v-model="clave"
            placeholder="Contraseña"
            required />
   </div>
   <span v-if="clave.length > 1">{{valid_cla_msg}}</span>
 </div>

 <div class="divbtnentrar">
        <button type="button" class="btnentrar"
        v-on:click="guardarestudiante"
        >Registrarse</button>
       </div>

 <div>
   <div>
    <p class="p-text">
     Acepta que los datos proporcionados son los correctos y que eres mayor de 18 años de edad.<br>
     Es posible que las personas que utilizan nuestro servicio hayan subido tu información<a class="masinformacion" id="masinformacion" href="">Más información.</a>  
    </p>  
   </div>
 <div>
   <p class="p-text">
     Al hacer clic en Registrarse, usted acepta nuestros Términos, Política de privacidad y Política de cookies. Puede recibir notificaciones por SMS de nuestra parte y puede optar por no participar en cualquier momento.
   </p>
  </div>

</div>
<div class="countcont">
 Si ya tienes cuentas? 
 <div class="conbtn">
  <RouterLink to="/login" class="btnsesion">Iniciar Sesion</RouterLink> 
  <!-- <button type="button"  class="swal2-styled swal2-confirm">Inciar Sesión</button> -->
 </div>

</div>
</div>
</form>

</template>


<script>
export default{
  
  data() {
    return {
        nombre:"",
        valid_nom_msg:"",
        apellidos:"",
        valid_ape_msg:"",
        usuario:"",
        valid_usu_msg:"",
        correo:"",
        valid_cor_msg:"",
        clave:"", 
        valid_cla_msg:"",

    }
  },
  watch: {
    nombre: function(value) {
      this.validNombre(value, 'valid_nom_msg');
    },
    apellidos: function(value) {
      this.validApellido(value, 'valid_ape_msg');
    },
    usuario: function(value) {
      this.validUsuario(value, 'valid_usu_msg');
    },
    correo: function(value) {
      this.validcorreo(value, 'valid_cor_msg');
    },
    clave: function(value) {
      if(this.check_password_length(value, 'valid_cla_msg', 7)) {
        this.check_passwords_match();
      }
    }

  },
  methods:{
    validNombre(nombre, msg) {
      if (/^[A-Z]+$/i.test(nombre)) {
        this[msg] = 'Correcto';
        return true;
      } 
      else if(nombre == null){
        this[msg] = 'Ingrese Nombre';
        return false;
      }
      else if (nombre == ""){
        this[msg] = 'Nombre no puede estar vacio';
        return false;
      }
      else {
        this[msg] = 'Nombre no puede contener numero';
        return false;
      } 
    },

    validApellido(apellidos, msg) {
      if (/^[A-Z]+$/i.test(this.apellidos)) {
        this[msg] = 'Correcto';
        return true;
      } 
      else if(apellidos == null){
        this[msg] = 'Ingrese Nombre';
        return false;
      }
      else if (apellidos == ""){
        this[msg] = 'Nombre no puede estar vacio';
        return false;
      }
      else {
        this[msg] = 'Nombre no puede contener numero';
        return false;
      } 
    },

    validUsuario(usuario, msg) {
      if (/^[0-9A-Za-zs-]+$/.test(this.usuario)) {
        this[msg] = 'Correcto';
        return true;
      } 
      else if(usuario == null){
        this[msg] = 'Ingrese Usuario';
        return false;
      }
      else if (usuario == ""){
        this[msg] = 'Usuario no puede estar vacio';
        return false;
      }
      else {
        this[msg] = 'no esta permitido esta expresiones #$%&!)={';
        return false;
      } 
    },
    validcorreo(correo, msg) {
      if (/^w+ ([.-]?w+)*@w+ ([.-]?w+)* (.w {2,4})+$/i.test(this.correo)) {
        this[msg] = 'Correcto';
        return true;
      } 
      else if(correo == null){
        this[msg] = 'Ingrese correo';
        return false;
      }
      else if (correo == ""){
        this[msg] = 'Completar este campo';
        return false;
      }
      else {
        this[msg] = +'debe contener @ y .';
        return false; 
      } 
    },
  check_password_length(clave, msg) {
      var length = clave.length;

      if(length >=7) {
        this[msg] = '';
        return true;
      } else {
        this[msg] ='Escribe una clave valida';
        return false;
      }
      
    },
    check_passwords_match() {
      if(this.clave.length > 7 ) {
            this.disable_btn = true;
            return true;
        }
        else {
            this.disable_btn = false;
            return false;
          }
    },

    guardarestudiante(){
        var endpoint="http://localhost:8080/User/registrarusuario";
        var opciones={
            method:"POST",
            headers:{"Content-type":"Application/json"},
            body:JSON.stringify({id:this.id,nombre:this.nombre,apellidos:this.apellidos,
                usuario:this.usuario,correo:this.correo,clave:this.clave})
        }
        fetch(endpoint, opciones).then(async Response =>{

         try {
             if(Response.status)  
             Swal.fire({
            icon:'question',
            title: 'Desea Registrar Usuario?',
             showDenyButton: true,
            showCancelButton: false,
            confirmButtonText: 'Registrar',
           denyButtonText: `Cancelar`,
           }).then((result) => {
           if (result.isConfirmed) {
            Swal.fire('Guardado con exito', '', 'success')
           this.$router.push('/');

           } else if (result.isDenied) {
            Swal.fire('Los cambios no se guardaron', '', 'warning')
            return false
            }
           
          })
             else{
              alert("error")
             }
         }   catch (error) {
        return "{\"sucess\":false ,\"message\":\"Error al intentar registrar.\"}";
       }     
        })    
    },
  }
}


</script>
<style lang="less">
.masinformacion{
 padding-left:0.2rem;
  background: #b9c7fa;

}

.countcont{
  display: flex;
  justify-content: center;
  font-size:15px;
  color:#25274A;
.conbtn{
  padding-left: 0.3rem;
  .btnsesion{
    background: #b9c7fa;
    border:none;
    border-radius: 10px;
  }
}

}
.divbtnentrar{
  padding-left: 100px;
  width: 50%;
  margin: 0 auto;
  position: relative;
  button{
    display: inline;
    border:none;
    border-radius:10px;
    width: 50%;
    height: 40px;
    margin:0 auto;
    &:hover{
      background:#25274A;
      color:beige;
    }
  }
}
</style>