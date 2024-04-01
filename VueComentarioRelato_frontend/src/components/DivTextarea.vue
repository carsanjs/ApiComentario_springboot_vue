<script >
import TituloComentario from './TituloComentario.vue'
import FormatoFecha from './FormartoFecha.vue'


  export default{
    name:'ComentarioRelato',
     data() {
      return {
        mensaje:{
    texto:'Escribir Aqui...',
    maxlength:225
   },
      }
     
     },
     components:{
      TituloComentario,
      FormatoFecha

},

  }
</script>

<template>
    <div>
      <!-- <TituloComentario titulo="Detras de las redes sociales" /> -->

<div class="div-conta-text"> 
<textarea name="textarea" id="textarea" cols="30" rows="10"
 required="" 
 v-model="mensaje.texto"
v-bind:placeholder="mensaje.texto"
 :maxlength="mensaje.maxlength"
>
</textarea>
<!-- <div>{{ mensaje.texto.length }}</div> -->
<span class="counter"><br>
  {{ mensaje.texto.length}} / {{mensaje.maxlength}}
    </span> 
</div>    

<div class="div-conta-fecha">
 <div  class="div-fecha">
   
  <span id="fecha">  <FormatoFecha/> </span>
     
 </div>
</div>
    </div>
  
</template>