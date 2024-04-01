<script>
export default{
    data() {
        name:"EditarPublicacion"
        return {
          
        }
    },
    components:{
        DivTextarea
    }
}

</script>


<template>
      <main :key="mainrelatos" class="main-container-todo-relatos" v-for="(item, mainrelatos) in 5">
        <div class="div-container-relatos">
            <div class="div-titulo-relato">
                <span class="span-cont-h2"><h2>Titulo :</h2></span> 
                <div class="div-container-input-relato">
                    <input type="text" name="" id="" placeholder="Escribe tu titulo..">
                </div>     
            </div>

        <div class="div-contendor-comentario"> 
            <span class="span-cont-h2"><h2>Relato :</h2></span>
        </div>


           <DivTextarea></DivTextarea>
       

        <!-- <edit-delete editar="guardar"
        eliminar="eliminarr"
        /> -->
            <!-- <div class="div-conta-text">      
            <textarea name="" id="" cols="30" rows="10" placeholder="Escribir tu relato aqui..."></textarea>
            </div>  -->
        </div>
      </main>

</template>