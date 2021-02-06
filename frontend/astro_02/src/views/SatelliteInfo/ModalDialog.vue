<template>
  <div>
    <div id="backdrop"></div>
    <div id="dialog" ref="dialog">
      <slot></slot>
    </div>    
  </div>    
</template>
<script>
export default {
  name: 'ModalDialog',
  props: [ 'width' ],
  mounted() {
    this.$forceUpdate();
  },
  updated() {
    if (this.$props.width)
      this.$refs.dialog.style.width = this.$props.width;
    let value = "-" + (this.$refs.dialog.offsetWidth / 2) + "px";
    this.$refs.dialog.style.marginLeft = value;
  }
}
</script>
<style scoped>
  div#backdrop { 
      position: absolute; 
    left: 0; top: 0; width: 100%; height: 100%;
    background-color: #aaa; opacity: 0.5; margin-top: 40%;
  }
  div#dialog { position: absolute; 
    top: 100px; 
    left: 50%;
    padding: 30px; background-color: white;
    border: 1px solid #ccc; box-shadow: 4px 4px 4px #666; margin-top: 40%;
      max-width: 500px;
  }
</style>

