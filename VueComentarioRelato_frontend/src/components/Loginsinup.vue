

<template>
  <main  class="main-container-todo-relatos">
        <div class="div-container-relatos">
          <form method="GET"  @submit.prevent="Comentario" >
            <div>
              <div class="div-titulo-relato">
                <span class="span-cont-h2"><h2>Titulo :</h2></span> 
                <div class="div-container-input-relato">
                    <input type="text" 
                    name="titulo"
                    v-model="usuario.titulo" 
                    id="titulo" 
                    >
                </div>     
            </div>
          <div class="div-conta-text"> 
<textarea 
name="textarea" 
id="textarea" cols="30" rows="10"
 v-model="usuario.escribirRelato"
 :maxlength="mensaje.maxlength"
 disabled>
</textarea>
           </div>    

            </div>
          
<div class="div-conta-fecha">
 <div  class="div-fecha">
   
  <span id="fecha">  
  <FormatoFecha/> </span>
     
 </div>
</div>
  
    <div class="div-container-button">
              <div class="bnt">
                <button type="button" class="sucess" >{{Edit}}</button>
              </div>
              <div class="bnt">
              <button type="submit" class="sucess">
                <router-link to="/publicar" class="sucess">{{Publi}}</router-link>
              </button>
            </div>
           </div>
                <!-- <div class="bnt">
                <button type="submit" class="fail" >
                  <router-link to="/sinup" class="fail">{{cancel}}</router-link></button>
                </div> -->
                
          </form>
        
        </div>
  </main>

</template>


<script>
import FormatoFecha from './FormartoFecha.vue'

export default{
  data() {
      return {
        Edit:'Editar',
        Publi:'Publicar',
        cancel:'Cancelar',
        idPublicar:'',
        mensaje:{
            texto:'Escribir Aqui...',
             maxlength:225
             },
             titulo:'',
        escribirRelato:'',
        usuario:[]
        
      }
  },  
  methods:{
    Comentario() {
            var endpoint = "http://localhost:8080/Comentario/ver";
            var opciones = { method: "GET" };
            fetch(endpoint, opciones)
            .then( response => response.json())
            .then( data => {this.usuario = data; console.log(data)})    
        },


},
    components:{
      FormatoFecha
    }
}
</script>