
<script setup>
defineProps({
  titulo: {
    type: String,
    required: true
  }
})
</script>

<template>
    <div class="div-container-titulo">
        <span class="span-cont-h2">
            <h2>{{titulo}}</h2>
        </span>       
    </div> 
</template>

<style lang="less">
@var_color_text:#25274A;
@var_color_fondo:#b9c7fa;
@var_fondo_body:#d9d9d9;

* {
    box-sizing: border-box;
  }
  


        .div-container-titulo{
           
            h2{
              font-weight: bold;
    font-size: 28px;
    color: #25274A;
    text-align: center;
    font-family: 'Unna', serif;
}
        }

        .div-contenedor-comentario{
            // background-color: red;
            padding: 5px;
        }

</style>
