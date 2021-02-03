import Vue from 'vue'
import App from './App.vue'
import axios from 'axios';
import router from './routes/index.js'; // 뷰 라우터 사용

// Vue.use(VueRouter)
Vue.config.productionTip = false

Vue.prototype.$axios = axios; //전역변수로 설정 컴포넌트에서 this.$axios 호출할 수 있음

new Vue({
  render: h => h(App),
  router,
}).$mount('#app')