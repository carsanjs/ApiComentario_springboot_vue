<script>
import TituloComentario from './TituloComentario.vue'
import FormatoFecha from './FormartoFecha.vue'
import EditDelete from './EditDelete.vue'
import DivTextarea from './DivTextarea.vue'

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
      FormatoFecha,
      EditDelete,
      DivTextarea

},

  }
</script>

<template>

<main class="main-container-todo-relatos" :key="comentario" v-for="(item, comentario) in 5">
<div class="div-container-relatos">
  <TituloComentario titulo="Detras de las redes sociales" />
   <DivTextarea></DivTextarea>
  <EditDelete></EditDelete>
</div>
</main>
</template>