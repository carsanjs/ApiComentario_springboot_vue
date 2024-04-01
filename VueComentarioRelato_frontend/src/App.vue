<script >
import { RouterLink, RouterView } from 'vue-router'
// import HelloWorld from './components/HelloWorld.vue'
// import ComTitle from '@/components/ComTitle'
import titulindex from './components/titulindex.vue'
import Comentariorelato from './components/Comentariorelato.vue'
import Loginsinup from './components/Loginsinup.vue'
export default{

   data() {
     return {
       mostrasmenu:false
     }
   },
   components:{
        Comentariorelato,
         titulindex,
         Loginsinup
       }
 }
</script>

<template>
   <titulindex></titulindex>
  <header>
    <!-- <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" /> -->
 
    <div class="wrapper">
      <!-- <HelloWorld msg="You did it!" /> -->
      <nav class="navcontent">
        <!-- <RouterLink to="/">Registrarse</RouterLink> -->
        <RouterLink to="/register">Registrarse</RouterLink>
       <RouterLink to="/" >Inicio</RouterLink>
        <RouterLink to="/login">Iniciar Sesion</RouterLink> 
        <!-- <RouterLink to="/**" >Mis Relatos</RouterLink>
        <RouterLink to="/**" >Tus Relatos</RouterLink> -->
        <!-- <RouterLink to="/publicar" >Publicar</RouterLink> -->
        <!-- <RouterLink to="/**" >Cerrar Sesión</RouterLink>  -->

      </nav>
    </div>
  </header>

 <RouterView />
</template>

<style scoped>
.navcontent{
  padding: 0.2rem;
  background: #b9c7fa;
  margin:0 auto;
  width: 70%;
  border-radius: 10px;
  display: flex;
justify-content: space-between;
}

header {
  line-height: 1.5;
  max-height: 100vh;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
  margin-top: 2rem;
}

nav a.router-link-exact-active {
  /* color: var(--color-text); */
  color:#25274A;
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}

nav a:first-of-type {
  border: 0;
}

@media (min-width: 1024px) {
  header {
    /* display: flex; */
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }

  nav {
    text-align: center;
    margin-left: -1rem;
    font-size: 1rem;
    padding: 1rem 0;
    margin-top: 1rem;
  }
}
</style>
