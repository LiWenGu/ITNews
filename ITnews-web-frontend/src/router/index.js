import Vue from 'vue'
import Router from 'vue-router'
import ITNews from '@/components/page/ITNews'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'ITNews',
      component: ITNews
    }
  ]
})
