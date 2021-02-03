<template>
  <div class="app">
    <div class="one"></div>
  </div>
</template>

<script>
export default {
}
</script>

<style scoped>
 .app {
   position: relative;
    top: 0;
    padding: 0;
    margin: 0;
    width: 100%;
    height: 250px;
   background-color: aliceblue;
   background-image:url('https://cdn.spacetelescope.org/archives/images/thumb700x/heic0709b.jpg');
   /*Credit: NASA, ESA, Marc Postman (STScI), and the CLASH team. */
 }
 .one {
   position: absolute;
   margin-top: 198px;
  vertical-align: bottom;
  width: 100%;
  background: black;
  height: 52px;
  display: inline-block;
  /* flex-direction: row; */
  /* list-style-type: none; */
  opacity: 0.8; /*흐리게 조절*/
 }
</style>