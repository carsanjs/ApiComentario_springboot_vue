<script>
import DivTextarea from './DivTextarea.vue';
import EditDelete from './EditDelete.vue';
import TituloComentario from './TituloComentario.vue'
import FormatoFecha from './FormartoFecha.vue'


export default{
    data() {
        return {
            save:'Guardar',
            cancel:'Cancelar',
            titulo:'',
            escribirRelato:'',
     mensaje:{
            texto:'Escribir Aqui...',
             maxlength:225
             }
        }
    },
    components:{
        DivTextarea,
        EditDelete,
        TituloComentario,
        FormatoFecha
    },
    methods:{
        newpublic(){
        var endpoint="http://localhost:8080/Comentario/guardar";
        var opciones={
            method:"POST",
            headers:{"Content-type":"Application/json"},
            body:JSON.stringify({
            titulo:this.titulo,
            escribirRelato:this.escribirRelato,})
        }
        fetch(endpoint, opciones).then(async Response =>{
         try {
             if(Response.ok)  
             Swal.fire({
            icon:'question',
            title: 'Desea Registrar publicacion?',
             showDenyButton: true,
            showCancelButton: false,
            confirmButtonText: 'Publicar',
           denyButtonText: `Cancelar`,
           }).then((result) => {
           if (result.isConfirmed) {
            Swal.fire('Publicado con exito', '', 'success')
           this.$router.push('/sinup');

           } else if (result.isDenied) {
            Swal.fire('Los cambios no se guardaron', '', 'warning')
            return false
            }
          })
             else{
              alert("error")
             }
         }   catch (error) {
        return "{\"sucess\":false ,\"message\":\"Error al intentar guardar publicacion.\"}";
       }       
        })    
    },
    }
}
</script>

<template>
    <main  class="main-container-todo-relatos">
        <div class="div-container-relatos">
            <form action="" @submit.prevent="newpublic">
            <div class="div-titulo-relato">
                <span class="span-cont-h2"><h2>Titulo :</h2></span> 
                <div class="div-container-input-relato">
                    <input type="text" 
                    name="titulo"
                    v-model="titulo" 
                    id="" 
                    placeholder="Escribe tu titulo.."
                    required>
                </div>     
            </div>

        <div class="div-contendor-comentario"> 
            <span class="span-cont-h2"><h2>Relato :</h2></span>
        </div>
<div class="div-conta-text"> 
<textarea name="textarea" id="textarea" cols="30" rows="10"
 required
 v-model="escribirRelato"
v-bind:placeholder="mensaje.texto"
 :maxlength="mensaje.maxlength"
>
</textarea>
<!-- <div>{{ mensaje.texto.length }}</div> -->
<span class="counter"><br>
  {{ escribirRelato.length}} / {{mensaje.maxlength}}
    </span> 
</div>    

<div class="div-conta-fecha">
 <div  class="div-fecha">
   
  <span id="fecha">  <FormatoFecha/> </span>
     
 </div>
</div>      
        <div class="div-container-button">
              <div class="bnt">
                <button type="submit" class="sucess">{{save}}</button>
              </div>

              <div class="bnt">
              <button type="button" class="fail" >
                <router-link to="/sinup" class="fail">{{cancel}}</router-link></button>
              </div>
          </div>

<!-- 
            <div class="div-conta-text">      
            <textarea name="" id="" cols="30" rows="10" placeholder="Escribir tu relato aqui..."></textarea>
            </div>  -->
        </form>
        </div>
      </main>
</template>