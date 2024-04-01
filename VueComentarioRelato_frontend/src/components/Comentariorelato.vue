<script>
import TituloComentario from './TituloComentario.vue';
import DivTextarea from './DivTextarea.vue';
import comentariosession from './comentariosession.vue';
import ejer from './ejer.vue';
export default {
  data() {
    return {
      
    }
  },
  components:{
    DivTextarea,
    TituloComentario,
    comentariosession,
    ejer
  }
}
</script>

<template>
<main class="main-container-todo-relatos" >
<div class="div-container-relatos">
<TituloComentario titulo="Detras de las redes sociales" />
<DivTextarea></DivTextarea>
<ejer></ejer>
<div class="divclassaccion">
<div class="classlike">
    <img class="icoaccion" src="../../img/like.jpg" alt="like">
</div>
<div class="classinlike">
    <img class="icoaccion" src="../../img/dislike.png" alt="dislike">
</div>
</div>
<comentariosession></comentariosession>

    
</div>
</main>
</template>
