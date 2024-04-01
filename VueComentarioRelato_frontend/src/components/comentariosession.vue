
<script>
export default{
    data() {
        name:"comentariosession"
        return {
            
        }
    },
    
}
</script>

<template>
  
  
<div class="div-contenedor-comentario"> 

<div class="div-conten-container">
    <div class="div-container-comen">
    <textarea name="" id="" cols="30" rows="10"></textarea>
</div>

</div>
</div>
    <div class="div-container-button">
        <div class="bnt">
          <button type="button" class="sucess">Comentar</button>
        </div>
        <div class="bnt">
            <router-link to="/login">
                <button type="submit" class="fail">Iniciar sesión</button>
            </router-link>
       
        </div>
    </div>

</template>