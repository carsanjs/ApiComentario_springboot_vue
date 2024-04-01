<script >
export default{

  data() {
    return {
      edit:"Editar",
      publicar:"Publicar",
      delet:"Eliminar"
    }
  },
}

</script>

<template>
     <div class="div-container-button">
              <div class="bnt">
                <button type="button" class="sucess" >
                  <router-link to="/editPublic" class="sucess">{{edit}}</router-link></button>
              </div>
              <div class="bnt">
              <button type="submit" class="sucess" >
                <router-link to="/publicar" class="sucess">{{publicar}}</router-link></button>
              </div>
              <div class="bnt">
              <button type="submit" class="fail" >{{delet}}</button>
              </div>
          </div>
</template>