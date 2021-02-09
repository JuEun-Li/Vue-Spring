<template>
  <div>
    <br>
    <h2>개요</h2><br>
    <span class="font2"><font size="3em" color="navy">home > 개요</font></span><br><br>
      <hr><br>
      
    <div class="first">
        <i class="star fas fa-star-and-crescent fa-2x"></i>
      우주는 '물질과 시공간을 일정한 힘으로 담고있는 공간'을 의미합니다.</div><br><br><br><br>

    <p class="pic_1">
        <a href="https://esahubble.org/images/heic0715a/">
        <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/heic0715a.jpg" alt="사진 없음"></a><br>
        <font size="2em" color="gray" class="font1">NASA, ESA and the Hubble Heritage </font>
         <font size="2em" color="gray" class="font1"> (STScI/AURA)-ESA/Hubble Collaboration</font>
    </p>
    <div class="box_1">
        <p class="pic_1"><i class="icon_left1 fas fa-quote-left fa-2x"></i><br><br>
          지구 바깥에는 '우주'라는 공간이 존재하며, <br>그 곳에는 다양한 가족들이 있습니다.<br>
          별, 행성, 위성, 소행성, 성운, 성단 등등..<br>
          '우주'란 무엇일까요?<br>
          우주는 <mark>'물질과 시공간을 일정한 힘으로 담고있는 공간'</mark>을 의미합니다.<br>
          이 우주의 신비 속으로 들어가봅시다!<i class="icon_right1 fas fa-quote-right fa-2x"></i><br><br>
        </p></div><br><br><hr>
        <br><br><br>

      <p class="pic_2">
        <a href="https://esahubble.org/images/solar_system_b/">
        <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/solar_system_b.jpg" alt="사진 없음"></a><br>
        <font size="2em" color="gray" class="font1">The International Astronomical  </font><br>
        <font size="2em" color="gray" class="font1">Union/Martin Kornmesser </font>
      </p>
      <div class="box_2">
        <p class="pic_1"><i class="icon_left2 fas fa-quote-left fa-2x"></i><br><br>
          우리 태양계 행성은 총 8개로, <br>
          [ <mark>수성, 금성, 지구, 화성, 목성, 토성, 천왕성, 해왕성</mark> ]<br> 입니다.<br>
          태양과 가장 가까운 수성부터<br>
           가장 멀리 있는 해왕성까지<br>
          우리 태양계 행성들의 이야기를 들어봅시다!
          <i class="icon_right2 fas fa-quote-right fa-2x"></i><br><br>
        </p></div><br><br><br><hr>
        <br><br><br>

      <p class="pic_1">
        <a href="https://esahubble.org/images/heic1904a/">
        <img src="https://cdn.spacetelescope.org/archives/images/thumb700x/heic1904a.jpg" alt="사진 없음"></a><br>
        <font size="2em" color="gray" class="font1">ESA/Hubble, NASA, L. Calçada </font>
      </p>
      <div class="box_3">
        <p class="pic_1"><i class="icon_left3 fas fa-quote-left fa-2x"></i><br><br>
          지구, 화성, 목성, 토성, 천왕성, 해왕성은<br>
          각 행성의 인력에 의하여 그 둘레를 돌고 있는 천체를 가지고 있습니다. <br>
          바로 <mark>'위성'</mark>입니다.<br>
          지구의 위성은 '달' 하나 뿐입니다.<br>
          다른 행성들은 어떤 위성을 가지고 있을까요?
          <i class="icon_right3 fas fa-quote-right fa-2x"></i><br><br>
        </p></div><br><br>
        <br><br><br>
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
 hr {
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
   display: inline-block;
   width:100%;
   text-align: center;
   /* margin-left: 28%; */
   color: gray;
   padding-right: 15px;
 }
.pic_1 {  
  width: 400px;
  display: inline-block;
  vertical-align: middle;
  margin-left: 50px;
}
.pic_2 {  
  width: 400px;
  display: inline-block;
  vertical-align: top;
  margin-left: 50px;
}
img {
  /* display: inline; */
  margin-left: 100px;
  width: 300px;
  object-fit: contain; /*가로세로 비율을 유지한 채로 사이즈가 조절*/
}
/* -------------- img 관련 태그들 */
.font1 {
  margin-left: 100px;
}
.font2 {
  display: inline-block;
  width:100%;
  text-align: center;
  /* margin-left: 46%; */
}

/* 따옴표 아이콘 시작 */
.icon_left1 {
  float: left;
  color: rgb(202, 230, 148);
  margin-right: 5%;
}
.icon_right1 {
  float: right;
  color: rgb(202, 230, 148);
  margin-right: 5%;
}
.icon_left2 {
  float: left;
  color: lightblue;
  margin-right: 5%;
}
.icon_right2 {
  float: right;
  color: lightblue;
  margin-right: 5%;
}
.icon_left3 {
  float: left;
  color: rgb(169, 217, 247);
  margin-right: 5%;
}
.icon_right3 {
  float: right;
  color: rgb(169, 217, 247);
  margin-right: 5%;
}
/* 따옴표 아이콘 끝*/

/* 박스 서식 시작 */
.box_1, .box_2, .box_3 {
  margin-left: 10%;
  width: 450px;
  border: 7px solid;
  border-color: rgb(202, 230, 148);
  box-shadow: 7px 7px 7px lightgray;
  display: inline-block;
}
.box_2{
  border-color: lightblue;
}
.box_3{
  border-color: rgb(169, 217, 247);
}/* 박스 서식 끝 */

/*
.arrow_box {
  display: inline-block;
	position: relative;
	background: white;
	border: 4px solid aliceblue;
  margin-left: 100px;
  margin-top: 30px;
  box-shadow: 5px 5px 5px lightgray;
}
.arrow_box:after, .arrow_box:before {
	right: 100%;
	top: 50%;
	border: solid transparent;
	content: "";
	height: 0;
	width: 0;
	position: absolute;
	pointer-events: none;
}
.arrow_box:after {
	border-color: rgba(213, 213, 213, 0);
	border-right-color: white;
	border-width: 25px;
	margin-top: -25px;
}
.arrow_box:before {
	border-color: rgba(194, 199, 245, 0);
	border-right-color: aliceblue;
	border-width: 30px;
	margin-top: -30px;
}*/
/* 말풍선 css*/
</style>