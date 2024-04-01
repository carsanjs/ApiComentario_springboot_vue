import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Registrarse from '../views/Registrarse.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
    path:'/',
    name:'HomeView',
    component:HomeView
  },
    {
      path: '/register',
      name: 'register',
      component: Registrarse
    },
    {
      path: '/login',
      name: 'login',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/Iniciarsession.vue')
    },
    {
      path:'/sinup',
      name:'sinup',
      component: () => import('../views/VloginSucces.vue')
    },
    {
      path:'/publicar',
      name:'PublicRelato',
      component :() => import ('../views/PublicRelato.vue')
    },
   {
       path:'/editPublic',
       name:'EditarPublicacion',
       component:()=>import ('../views/EditarPublicacion.vue')
    }
  ]
})

export default router
