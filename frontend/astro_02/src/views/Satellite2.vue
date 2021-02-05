<template>
  <div>
      <br>
    <h2>목성의 위성</h2><br>
    <span class="font2"><font size="3em" color="navy">위성 이야기 > 목성의 위성</font></span><br><br>
      <hr class="hr1"><br>

      <span class="first">
        <i class="star fas fa-star-and-crescent fa-2x"></i>
      70개가 넘는 목성의 위성 중
       가장 큰 4개 <strong><mark>[ 이오, 유로파, 가니메데, 칼리스토 ]</mark></strong>는 갈릴레이 4대 위성입니다.</span><br><br><br><br>

      <a class="top" href="#" title="맨 위로"> <i class="fas fa-arrow-up fa-2x"></i><br></a>


    <div class="round_table">
        이오
    </div>

    <div class="round_table">
        유로파
    </div>

    <div class="round_table">
        가니메데
    </div>

    <div class="round_table">
        칼리스토
    </div>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
div {
    vertical-align: middle;
  }
  .hr1 {
   width: 600px;
   color: lightgray;
   border: solid 1px;
 }
  h2 {
   text-align: center;
 }
 .star {
   color: aqua;
   padding-right: 15px;
 }
 .first {
   width:100%;
   text-align: center;
   display: inline-block;
   color: gray;
 }
 .font2 {
   width: 100%;
  display: inline-block;
  text-align: center;
}
.round_table {
    margin: auto;
    text-align: center;
    width: 400px;
    min-width: 200px;
    height: 50px;
    color: black;
    font-size: 15px;
    box-shadow: 5px 5px 5px lightgray;
    padding: 1%;
    margin-top: 3%;
}
.top {
  width: 4.5%;
  height: 6.5%;
  padding-top: 1%;
  background-color: lightgray;
  color:gray;
  box-shadow: 2px 2px 2px lightgray;
  text-align: center;
  display: scroll;
  position: fixed;
  bottom: 5%;
  right: 5%;
  text-decoration: none;
  opacity:0.7;
}
</style>