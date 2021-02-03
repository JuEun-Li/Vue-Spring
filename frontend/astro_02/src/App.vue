<template>
  <div id="app">
    <tool-bar></tool-bar>
    <back-ground></back-ground>
    <router-view></router-view>
    <astro-footer></astro-footer>   
  </div>
</template>

<script>
import BackGround from './components/BackGround.vue';
import ToolBar from './components/ToolBar.vue';
import AstroFooter from './components/AstroFooter.vue';

export default {
  components: {
    AstroFooter,
    ToolBar,
    BackGround,
  }
}
</script>

<style type="text/css">
  
</style>