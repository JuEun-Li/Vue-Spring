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
    background-size: cover;
   /* background-image:url('https://cdn.spacetelescope.org/archives/images/thumb700x/heic0709b.jpg'); */
   /*Credit: NASA, ESA, Marc Postman (STScI), and the CLASH team. */

    background-image:url('https://cdn.spacetelescope.org/archives/images/thumb700x/heic1509e.jpg');
    /* Credit: NASA, ESA, the Hubble Heritage Team (STScI/AURA), A. Nota (ESA/STScI), and the Westerlund 2 Science Team */

     /* background-image:url('https://cdn.spacetelescope.org/archives/images/thumb700x/heic1301a.jpg'); */
   
 }
 .one {
   position: absolute;
   margin-top: 198px;
  vertical-align: bottom;
  width: 100%;
  /* background: rgb(194, 161, 224); */
   background:rgb(208, 228, 228);
  height: 52px;
  display: inline-block;
  opacity: 0.7; /*흐리게 조절*/
 }
</style>