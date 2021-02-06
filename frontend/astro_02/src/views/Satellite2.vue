<template>
  <div>
      <br>
    <h2>목성의 위성</h2><br>
    <span class="font2"><font size="3em" color="navy">위성 이야기 > 목성의 위성</font></span><br><br>
      <hr class="hr1"><br>

      <span class="first">
        <i class="star fas fa-star-and-crescent fa-2x"></i>
      70개가 넘는 목성의 위성 중 아래 본문에 있는 가장 큰 4개는 갈릴레이 4대 위성입니다.</span><br><br><br><br>

      <a class="top" href="#" title="맨 위로"> <i class="fas fa-arrow-up fa-2x"></i><br></a>

    <div class="table_c">
    <span class="round_table">
        <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3567177&cid=58945&categoryId=58974">
        <img src="https://ncc-phinf.pstatic.net/webtop01/2009/4/22/226/3.jpg?type=w323" alt="사진 없음"></a></p>
        <h3 style="color: black">이오</h3><br>
        <button type="button" @click="showDialog1 = true" class="btn_shape">상세 정보</button>
    </span>

    <span class="round_table">
        <p class="pic_1">
        <a href="https://esahubble.org/images/opo1633a/">
        <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/opo1633a.jpg" alt="사진 없음"></a></p>
        <h3 style="color: black">유로파</h3><br>
        <button type="button" @click="showDialog2 = true" class="btn_shape">상세 정보</button>
    </span>

    <span class="round_table">
        <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3567177&cid=58945&categoryId=58974">
        <img src="https://ncc-phinf.pstatic.net/webtop01/2009/4/22/51/2.jpg?type=w323" alt="사진 없음"></a></p>
        <h3 style="color: black">가니메데</h3><br>
        <button type="button" @click="showDialog3 = true" class="btn_shape">상세 정보</button>
    </span>

    <span class="round_table">
        <p class="pic_1">
        <a href="https://nssdc.gsfc.nasa.gov/image/planetary/jupiter/callisto.jpg">
        <img src="https://nssdc.gsfc.nasa.gov/image/planetary/jupiter/callisto.jpg" alt="사진 없음"></a></p>
        <h3 style="color: black">칼리스토</h3><br>
        <button type="button" @click="showDialog4 = true" class="btn_shape">상세 정보</button>
    </span></div>
    <br><br><br><br>

    <UploadDialog1 v-if="showDialog1" @cancel="showDialog1=false" />
    <UploadDialog2 v-if="showDialog2" @cancel="showDialog2=false" />
    <UploadDialog3 v-if="showDialog3" @cancel="showDialog3=false" />
    <UploadDialog4 v-if="showDialog4" @cancel="showDialog4=false" />
  </div>
</template>

<script>
import UploadDialog1 from './SatelliteInfo/UploadDialog1.vue'
import UploadDialog2 from './SatelliteInfo/UploadDialog2.vue'
import UploadDialog3 from './SatelliteInfo/UploadDialog3.vue'
import UploadDialog4 from './SatelliteInfo/UploadDialog4.vue'

export default {
  data() {
      return {
          showDialog1: false,
          showDialog2: false,
          showDialog3: false,
          showDialog4: false
      }
  },
  
  components: { UploadDialog1, UploadDialog2,  UploadDialog3,  UploadDialog4}
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
 h3 {
    display: inline-block;
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
    display: inline-block;
    text-align: center;
    padding: 1%;
    width: 20%;
    min-width: 200px;
    height: 300px;
    color: black;
    font-size: 15px;
    box-shadow: 3px 3px 3px lightgray;
    /* background-color: aliceblue; */
    padding: 1%;
    margin-top: 3%;
}
.table_c {
    margin-left: 10%;
    /* margin-right: 10%; */
}
img, .pic_1 {
  display: inline-block;
  margin: auto;
  height: 150px;
  width: 200px;
  object-fit: contain; 
  /*가로세로 비율을 유지한 채로 사이즈가 조절*/
}

/*------------------------------- button 서식 */
.btn_shape {
  border: 1.5px solid lightblue;
  box-shadow: 2px 2px 2px lightgray;
  color:white;
  background-color: lightblue;
  padding: 7px;
  margin-top: 10%;
  border-radius: 8px;
  outline: 0; /* 클릭시 테두리 삭제 */
}
.btn_shape:hover {
  background-color: rgba(0,0,0,0);
  color: skyblue;
  cursor: pointer;
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