
<script setup>
defineProps({
  titulo: {
    type: String,
    required: true
  }
})
</script>

<template>
    <div class="div-titulo-relato">
        <span class="span-cont-h2">
            <h2>{{titulo}}</h2>
        </span>       
    </div> 
</template>
