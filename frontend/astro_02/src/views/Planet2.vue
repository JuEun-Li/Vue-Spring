<template>
  <div>
    <br>
    <h2>가스형 행성</h2><br>
    <span class="font2"><font size="3em" color="navy">행성 이야기 > 가스형 행성</font></span><br><br>
      <hr class="hr1"><br>
      

    <span class="first">
      <i class="star fas fa-star-and-crescent fa-2x"></i>
      우리 태양계 행성중 가스형 행성은 [ 목성, 토성, 천왕성, 해왕성 ] 입니다.</span><br><br><br><br>

    <a class="top" href="#" title="맨 위로"> <i class="fas fa-arrow-up fa-2x"></i><br></a>

    <div class="notice_box"> <i class="fas fa-exclamation-circle fa-2x" style="color: rgb(172, 126, 219)"></i><br><br>
    아래 버튼 클릭시 본문이 중국어로 번역 됩니다.<br>
    다시 한국어로 되돌리고 싶으시다면 페이지 새로고침(F5)를 눌러주시길 바랍니다.</div>

    <div class="btn_div"><button class="btn" v-on:click="changed()"><strong>中文</strong></button></div>
    
    <table>
      <tr>
        <td><h3>목성</h3>
         <span class="img_wid">
          <p class="pic_1">
            <a href="https://esahubble.org/images/heic2017a/">
            <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/heic2017a.jpg" alt="사진 없음"></a>
          </p>
          <p class="pic_1">
            <a href="https://esahubble.org/images/heic2017a/">
            <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/heic2017a.jpg" alt="사진 없음"></a>
          </p></span>
          <!-- Credit: -->
<!-- NASA, ESA, A. Simon (Goddard Space Flight Center), and M. H. Wong (University of California, Berkeley) and the OPAL team. -->
          <ul id="content1">
            <li>{{ msg1 }}</li>
            <li>{{ msg2 }}</li>
            <li>{{ msg3 }}</li>
            <li>{{ msg4 }}</li>
          </ul>
        </td>

        <td><h3>토성</h3>
         <span class="img_wid">
          <p class="pic_1">
            <a href="https://esahubble.org/images/heic1917a/">
            <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/heic1917a.jpg" alt="사진 없음"></a>
          </p>
          <p class="pic_1">
            <a href="https://esahubble.org/images/heic1917a/">
            <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/heic1917a.jpg" alt="사진 없음"></a>
          </p></span>
          <!-- Credit:NASA, ESA, A. Simon (Goddard Space Flight Center), and M.H. Wong (University of California, Berkeley) -->
          <ul id="content2">
            <li>{{ msg5 }}</li>
            <li>{{ msg6 }}</li>
            <li>{{ msg7 }}</li>
            <li>{{ msg8 }}</li>
          </ul>
        </td>
      </tr>

      <tr>
        <td><h3>천왕성</h3>
          <span class="img_wid">
          <p class="pic_1">
            <a href="https://esahubble.org/images/opo0732a/">
            <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/opo0732a.jpg" alt="사진 없음"></a>
          </p>
          <p class="pic_1">
            <a href="https://esahubble.org/images/opo0732a/">
            <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/opo0732a.jpg" alt="사진 없음"></a>
          </p></span>
          <!-- Credit:NASA, ESA, and M. Showalter (SETI Institute) -->
          <ul id="content3">
            <li>{{ msg9 }}</li>
            <li>{{ msg10 }}</li>
            <li>{{ msg11 }}</li>
            <li>{{ msg12 }}</li>
          </ul>
        </td>

        <td><h3>해왕성</h3>
         <span class="img_wid">
          <p class="pic_1">
            <a href="https://esahubble.org/images/opo1622b/">
            <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/opo1622b.jpg" alt="사진 없음"></a>
          </p>
          <p class="pic_1">
            <a href="https://namu.wiki/w/%ED%95%B4%EC%99%95%EC%84%B1">
            <img src="https://w.namu.la/s/91d076a4f880604f784fd6e3695f9992389efac96b56624a495ca7f407864a2e5b8ba3979506f178df2dd211db962b5bd42b1a9306ae5ff9e92b231089919a9176bec70fa6e6c85fc02a826067810b11cca59d437162a31055754bc118708452" alt="사진 없음"></a>
          </p></span>
          <!-- Credit:NASA, ESA, and M.H. Wong and J. Tollefson (UC Berkeley) -->
          <ul id="content4">
            <li>{{ msg13 }}</li>
            <li>{{ msg14 }}</li>
            <li>{{ msg15 }}</li>
            <li>{{ msg16 }}</li>
          </ul>
        </td>
      </tr>
    </table> 
  </div>
</template>

<script>
export default {
  // el: "#content1",
  data() {
    return {
      msg1: '태양과의 거리: 5.5AU',
      msg2: '공전 주기: 약 4333일',
      msg3: '자전 주기: (평균)약 9시간 55분<br>',
      msg4: '특징: 태양계 행성중 가장 크다.',

      nextmsg1: "地球和太阳间的距离: 5.5AU",
      nextmsg2: "公转周期: 大概 4333日",
      nextmsg3: "自转周期: (平均) 大概 9个小时 55分",
      nextmsg4: "特点： 在太阳系的行星中最大",

      msg5: '태양과의 거리: 10AU',
      msg6: '공전 주기: 약 29년(10,700일)',
      msg7: '자전 주기: (평균)약 10시간 30분',
      msg8: '특징: 가장 크고 아름다운 고리를 가지고 있다.',

      nextmsg5: "地球和太阳间的距离: 10AU",
      nextmsg6: "公转周期: 大概 29年(10,700日)",
      nextmsg7: "自转周期: (平均) 大概 10个小时 30分",
      nextmsg8: "特点： 有又最大又漂亮的条纹",

      msg9: '태양과의 거리: 20AU',
      msg10: '공전 주기: 약 84.0205년 (30,688.5일)',
      msg11: '자전 주기: (평균)약 17시간 14분</li>',
      msg12: '자전축이 97.77° 기울어져있다.',

      nextmsg9: '地球和太阳间的距离: 20AU',
      nextmsg10: '公转周期: 大概 84.0205年(30,688.5日)',
      nextmsg11: '自转周期: (平均) 大概 17个小时14分',
      nextmsg12: '特点： 在太阳系的行星中有又最大又漂亮的条纹',

      msg13: '태양과의 거리: 30AU',
      msg14: '공전 주기: 약 164.8년 (60,182일)',
      msg15: '자전 주기: (평균) 약 16시간 6분',
      msg16: '특징: 태양계 행성 중 가장 멀리 있다.',

      nextmsg13: '地球和太阳间的距离: 30AU',
      nextmsg14: '公转周期: 大概 164.8年(60,182日)',
      nextmsg15: '自转周期: (平均) 大概 16个小时6分',
      nextmsg16: '特点： 在太阳系的行星中最远的行星'
    }
  },
  methods: {
    changed: function() {
      this.msg1= this.nextmsg1;
      this.msg2= this.nextmsg2;
      this.msg3= this.nextmsg3;
      this.msg4= this.nextmsg4;

      this.msg5= this.nextmsg5;
      this.msg6= this.nextmsg6;
      this.msg7= this.nextmsg7;
      this.msg8= this.nextmsg8;

      this.msg9= this.nextmsg9;
      this.msg10= this.nextmsg10;
      this.msg11= this.nextmsg11;
      this.msg12= this.nextmsg12;

      this.msg13= this.nextmsg13;
      this.msg14= this.nextmsg14;
      this.msg15= this.nextmsg15;
      this.msg16= this.nextmsg16;
    }
  }

}
</script>

<style scoped>
  .hr1 {
   width: 600px;
   color: lightgray;
   border: solid 1px;
 }
  h2 {
   text-align: center;
 }
 .star {
   color: blueviolet;
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
/* ---------------------------------------- */
table, td{
   min-width: 80%;
   max-width: 90%;
   padding: 2%;
   padding-left: 3%;
   border-collapse: collapse;
  font-size: 15px;
   border: 3px dashed lightgray;
   margin-left: auto; margin-right: auto;
   vertical-align: text-top;
 } /* table 스타일 */

 img, .pic_1 {
  display: inline-block;
  width: 200px;
  height: 200px;
  object-fit: contain; /*가로세로 비율을 유지한 채로 사이즈가 조절*/
}
.btn {
  /* border: 1.5px solid rgb(172, 126, 219); */
  border: none;
  box-shadow: 2px 2px 2px lightgray;
  color:white;
  background-color: rgb(172, 126, 219);
  background: linear-gradient( to top, rgb(172, 126, 219), rgb(223, 199, 247));
  padding: 10px;
  padding-left: 5%;
  padding-right: 5%;
  border-radius: 8px;
  outline: 0; /* 클릭시 테두리 삭제 */
  font-size: 20px;
}
.btn:hover {
  background-color: rgba(0,0,0,0);
  color: rgb(172, 126, 219);
  cursor: pointer;
}
.btn_div {
  margin-bottom: 5%;
  text-align: center;
}
.notice_box {
  width: 45%;
  padding: 3%;
  margin-bottom: 5%;
  text-align: center;
  margin-left: auto; margin-right: auto;
  border: 5px double rgb(223, 199, 247);
  box-shadow: 5px 5px 5px rgb(231, 219, 243);
  color: rgb(172, 126, 219);
  background-color: white;
  font-size: 15px;
}
</style>