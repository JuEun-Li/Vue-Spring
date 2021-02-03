<template>
  <div>
    <br>
    <h2>지구형 행성</h2><br>
    <span class="font2"><font size="3em" color="navy">행성 이야기 > 지구형 행성</font></span><br><br>
      <hr class="hr1"><br>
      

    <span class="first">
        <i class="star fas fa-star-and-crescent fa-2x"></i>
      우리 태양계 행성중 지구형 행성은 [ 수성, 금성, 지구, 화성 ] 입니다.</span><br><br><br><br>

      <a class="top" href="#" title="맨 위로"> <i class="fas fa-arrow-up fa-2x"></i><br></a>
    

    <table id="planet_table" title="클릭시 해당 내용으로 넘어갑니다.">
      <tr> 
        <td
        onClick="location.href='#mercury'"
        v-bind:class="{'white': !clicked1, 'blue': clicked1}" 
        v-on:click="clicked1 = !clicked1">수성</td>
  
        <td
        onClick="location.href='#venus'" 
        v-bind:class="{'white': !clicked2, 'blue': clicked2}" 
        v-on:click="clicked2 = !clicked2">금성</td>

        <td
        onClick="location.href='#mars'" 
        v-bind:class="{'white': !clicked3, 'blue': clicked3}" 
        v-on:click="clicked3 = !clicked3">화성</td>
      </tr>

    </table>
    <br><br><br><br>



    <i class="question fas fa-mercury fa-2x" id='mercury'></i>
     <strong>수성(水星, Mercury)이란?</strong>
     <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3571319&cid=58947&categoryId=58980">
        <img src="https://ncc-phinf.pstatic.net/ncc01/2011/2/16/185/1.jpg?type=w646" alt="사진 없음"></a></p>
      <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3571319&cid=58947&categoryId=58980">
        <img src="https://ncc-phinf.pstatic.net/ncc01/2011/2/16/233/3.jpg?type=w323" alt="사진 없음"></a></p>
        <br><br><hr class="hr2"><br>

    
    <i class="answer fas fa-exclamation fa-2x"></i>
    <strong>태양계에서 가장 빠른 행성</strong><br><br><br>

    <span class="answer-box">
      <!-- 태양계 첫번째 행성인 수성은 전령의 신 헤르메스(로마식 이름 머큐리)에서 따왔다.<br>
    수성이 태양과 매우 가까이 있기 때문에 (태양의 중력의 영향으로)
     매우 빠른 속도로 공전 하고 있다는 점에서 유래 되었다.<br><br>
     
     수성과 태양의 거리는 약 0.4 AU로, 태양계 행성중 태양과 가장 가까이 위치해있다. <br>
     따라서 공전 주기는 88일로, 가장 짧다. 수성에서의 1년은 88일인 셈이다. <br><br>
    지구 안쪽에 위치해있기 때문에(내행성) 밤에는 관측이 불가능하다.<br>
    해가 질 무렵(저녁), 그리고 동이 트기 전(새벽) 아주 잠깐 관측이 가능하다.<br><br>
    수성의 큰 특징중 하나는 일교차이다. 대기층이 매우 얇아 대기의 순환이 거의 일어나지 않으며, 바다가 없기 때문에 적도와 극의 온도 차가 극심하다.<br>
    긴 밤에는 (섭씨)영하 185도까지 내려가지만, 긴 낮에는 470도까지 올라간다.<br> -->
    
    <table class="answer-table">
      <tr>
        <td><h2 style="text-align:left">개요</h2></td>
        
        <td><i class="answer2 fas fa-book"></i><strong>유래</strong></td>
        <td>전령의 신 헤르메스(로마식 이름 머큐리)에서 유래되었다.<br>
            수성이 태양과 매우 가까이 있기 때문에 (태양의 중력의 영향으로)<br>
            매우 빠른 속도로 공전 하고 있다는 것이 그 이유.<br></td>
      </tr>
      <tr>
        
        <td></td> <td><i class="answer2 fas fa-people-arrows"></i><strong>태양과의 거리</strong></td><td>0.4AU</td>
      </tr>
      <tr>
        
        <td></td> <td><i class="answer2 fas fa-calendar-alt"></i><strong>공전 주기</strong></td><td>88일(수성에서의 1년은 88일)</td>
      </tr></table><br>

      <hr class="hr3">

      <table class="answer-table">
      <tr>
        <td><h2 style="text-align:left">특징</h2></td>
        <td><i class="answer2 fas fa-eye"></i><strong>관측 가능 시기</strong></td>
        <td> 밤에는 관측이 불가능하다.<br>
            해가 질 무렵(저녁), 그리고 동이 트기 전(새벽) 아주 잠깐 관측이 가능하다.</td>
      </tr>
      <tr>
        <td></td> <td><i class="answer2 fas fa-cloud-moon"></i><strong>큰 일교차</strong>
        </td><td>대기층이 매우 얇아 대기의 순환이 거의 일어나지 않으며, <br>
          바다가 없기 때문에 적도와 극의 온도 차가 극심하다.<br>
    긴 밤에는 -185°C까지 내려가지만, 긴 낮에는 470°C까지 올라간다.</td><br>
      </tr>
    </table><br>
    </span> <br><br><br><br><br>



    <i class="question fas fa-venus fa-2x" id='venus'></i>
     <strong>금성(金星, Venus)이란?</strong>

     <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3571332&cid=58947&categoryId=58980">
        <img src="https://ncc-phinf.pstatic.net/ncc02/2011/2/17/142/01.jpg?type=w646" alt="사진 없음"></a></p>
      <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3571332&cid=58947&categoryId=58980">
        <img src="https://ncc-phinf.pstatic.net/ncc02/2011/2/18/221/1-1.jpg?type=w315" alt="사진 없음"></a></p>    
     <br><br><hr class="hr2">

    <br>

    <i class="answer fas fa-exclamation fa-2x"></i>
    <strong>가장 아름답지만, 지옥과도 같은 행성</strong><br><br><br>

    <span class="answer-box">
      <!-- 금성은 태양과 달을 제외, 지구에서 관측할 수 있는 행성 중에서 가장 밝다. <br>
      색깔도 밝은 노랑에 가까우며, 아주 두터운 대기층이 태양빛을 밝게 반사하기 때문에 실제로 매우 밝고 화려하게 보인다. 그래서 비너스, 루시퍼와 같은 아름다운 신들의 이름을 가지고 있다.<br><br>
      금성은 (다른 행성에 비해 비교적)지구와 매우 가까이 위치해있으며, 크기 또한 매우 비슷하다.<br>
      따라서 금성 탐사에 앞서 많은 천문학자들은 '플로리다와 같은 따뜻한 기후를 가진 행성'일 것이라고 예측했다.
      하지만 실제 금성은 우리가 생각하던 '지옥'그 자체와 같다.<br>
       그 이유는 다음과 같다.<br><br>
       
      <ul>
        <li>지구의 90배에 달하는 대기압</li>
        <li>대기 성분의 96%이상이 이산화탄소 -> 온실효과 -> 내부 온도 약 섭씨 465도</li>
        <li>평균 풍속 360m/s (태풍 매미의 풍속 - 50m/s)</li>
        <li>고농축 황산으로 이루어진 대기로 인해 하루종일 황산비가 내린다.</li>
      </ul><br><br>
      금성의 가장 큰 특징은, 태양계 행성중 유일하게 자전방향이 반대라는 점이다. 자전축 또한 177도로, 특이한 각도를 가지고 있다.<br>
      공전 주기가 224일인 것에비해, 자전 주기가 243일이다. 금성에서의 1년보다 하루가 더 긴 것이다.<br>
      이 모든 것을 종합 해보았을 때, 아주 오래전 금성이 어떤 큰 물체와의 충돌로 인해 자전 속도와 자전축에 영향을 받았을 것이라고 추측하고 있으나,
      확실하게 밝혀진 것은 없다. <br> -->
      
    <table class="answer-table">
      <tr>
        <td><h2 style="text-align:left">개요</h2></td>
       
        <td><i class="answer2 fas fa-book"></i><strong>유래</strong></td>
        <td>태양과 달을 제외, 지구에서 관측할 수 있는 행성 중 가장 밝다. <br>
      밝은 노란색에 가까우며, 아주 두터운 대기층이 태양빛을 밝게 반사하기 때문에 매우 밝고 화려하게 보인다. <br>
      따라서 비너스, 루시퍼와 같은 아름다운 신들의 이름을 가지고 있다.</td>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-people-arrows"></i><strong>태양과의 거리</strong></td><td>0.7AU</td>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-calendar-alt"></i><strong>공전 / 자전 주기</strong></td>
        <td>224일 / 243일<br>
        특이하게도, 금성은 자전 주기보다 길다. (하루가 1년보다 긴 것)</td>
      </tr>
      
      <tr>
        <td></td> <td><i class="answer2 fas fa-ruler-combined"></i><strong>자전축</strong></td>
        <td>177.3°</td>
      </tr>

      </table><br>

      <hr class="hr3">

      <table class="answer-table">
      <tr>
        <td><h2 style="text-align:left">특징</h2></td>
        <td><i class="answer2 fas fa-eye"></i><strong>관측 가능 시기</strong></td>
        <td> 밤에는 관측이 불가능하다.<br>
            해가 질 무렵(저녁), 그리고 동이 트기 전(새벽) 아주 잠깐 관측이 가능하다.</td>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-user-friends"></i><strong>지구와 형제?</strong></td>
        <td>금성은 (다른 행성에 비해 비교적)지구와 매우 가까이 위치해있으며, 크기 또한 매우 비슷하다.<br>
      따라서 많은 천문학자들이 '플로리다와 같은 따뜻한 기후를 가진 행성'일 것이라고 예측했다.
      하지만 실제 금성은 우리가 생각하던 '지옥'그 자체와 같다. 이유는 아래와 같다.</td>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-fire-alt"></i><strong>지옥과 같은 이유</strong>
        <td>1. 지구의 90배에 달하는 대기압<br>
          2. 내부 온도 465°C<br>(대기 성분의 96%이상이 이산화탄소이다. 따라서 온실효과 발생)<br> 
          3. 평균 풍속 360m/s (태풍 매미의 풍속 - 50m/s)<br>
          4. 고농축 황산으로 이루어진 대기로 인해 하루종일 내리는 황산비
        </td>
      </tr>

    </table><br>
    </span> <br><br><br><br><br> 



    <i class="question fas fa-mars fa-2x" id='mars'></i>
     <strong>화성(火星, Mars)이란?</strong>

     <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3571384&cid=58947&categoryId=58980">
        <img src="https://ncc-phinf.pstatic.net/20151203_146/1449126306897lrDag_JPEG/00.jpg?type=w646" alt="사진 없음"></a></p>
      <p class="pic_1">
        <a href="https://terms.naver.com/entry.nhn?docId=3571332&cid=58947&categoryId=58980">
        <img src="https://ncc-phinf.pstatic.net/ncc02/2011/2/28/186/2.jpg?type=w305" alt="사진 없음"></a></p>
     <br><br><hr class="hr2"><br>

    <i class="answer fas fa-exclamation fa-2x"></i>
    <strong>붉게 타오르는 것 같은 행성</strong><br><br><br>

    <span class="answer-box">
      <!-- 화성은 수성, 금성과 달리 지구 바깥에 위치해있어(외행성) 밤에만 관측이 가능하다.<br>
      아주 밝은 것과 더불어, 맨 눈으로도 붉은 색을 관측할 수 있다.<br>
      활활 타오르는 것 같은 강렬한 색상 때문에 전쟁의 신(mars)의 이름으로 불리게 되었다고 한다.<br><br>
      화성의 표면 색이 붉은 이유는 산화철(녹슨 철) 성분이 다량 포함되어있기 때문으로 밝혀졌다.<br><br>
      금성과 더불어 그나마 지구와 유사한 조건을 가지고 있어<br>
      태양계 행성중 [큐리오시티, 인사이트 등] 수 많은 탐사선이 탐사를 진행한 행성이다. 그만큼 UFO와 외계인에 대한 각종 루머가 가장 많은 행성이다.<br>
      실제로 생명체가 발견되지는 않았으나, 물이 존재하기 때문에 생명체가 존재할 가능성이 조금은 남아있다.<br><br> -->
    
    <table class="answer-table">
      <tr>
        <td><h2 style="text-align:left">개요</h2></td>

        <td><i class="answer2 fas fa-book"></i><strong>유래</strong></td>
        <td>아주 밝은 것과 더불어, 맨 눈으로도 붉은 색을 관측할 수 있다.<br>
            활활 타오르는 것 같은 강렬한 색상 때문에 전쟁의 신(mars)의 이름으로 불리게 되었다고 한다.<br></td>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-people-arrows"></i><strong>태양과의 거리</strong></td><td>1.5AU</td>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-calendar-alt"></i><strong>공전 / 자전 주기</strong></td><td>687일 / 24시간 37분</td>
      </tr></table><br>

      <hr class="hr3">

      <table class="answer-table">
      <tr>
        <td><h2 style="text-align:left">특징</h2></td>
        <td><i class="answer2 fas fa-eye"></i><strong>관측 가능 시기</strong></td>
        <td> 화성은 수성, 금성과 달리 지구 바깥에 위치해있어(외행성) 밤에만 관측이 가능하다.</td>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-paint-brush"></i><strong>색이 붉은 이유</strong></td>
        <td>표면에 산화철(녹슨 철) 성분이 다량 포함되어있기 때문</td><br>
      </tr>

      <tr>
        <td></td> <td><i class="answer2 fas fa-robot"></i><strong>탐사 진행</strong></td>
        <td>금성과 더불어 그나마 지구와 유사한 조건을 가지고 있어<br>
      태양계 행성중 [큐리오시티, 인사이트 등] 수 많은 탐사선이 탐사를 진행한 행성이다.<br>
       그만큼 UFO와 외계인에 대한 각종 루머가 가장 많은 행성이다.<br>
      실제로 생명체가 발견되지는 않았으나, 물이 존재하기 때문에 생명체가 존재할 가능성이 조금은 남아있다.</td><br>
      </tr>
    </table><br>
    </span> <br><br><br><br><br>
    
  </div>
</template>

<script>
export default {
  el: "#planet_table",
  data: function(){
   return {
     clicked1: false,
     clicked2: false,
     clicked3: false
   }
  }
}
</script>

<style scoped>
 .white {
       background-color: white;
   }
   .blue {
       background-color: blue;
   }
  div {
    vertical-align: middle;
  }
  .hr1 {
   width: 600px;
   color: lightgray;
   border: solid 1px;
 }
  .hr2 {
   width: 900px;
   color: lightgray;
   border: solid 1px;
 }
 .hr3 {
   width: 750px;
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
.question {
   margin-left: 15%;
   padding-right: 15px;
   color: lightsteelblue;
 }
 .answer {
   margin-left: 15%;
   padding-right: 15px;
   color: pink;
 }/* icon 스타일 1 */
 .answer2 {
   vertical-align: middle;
   padding-right: 10%;
   /* color: darkorchid; */
   color: darkslateblue;
 }/* icon 스타일 2 */
 .answer-box {
   display: inline-block;
   border: 3px dashed lightgray;
   padding: 1% 3%;
   margin-left: 15%;
   margin-right: 15%;
 }
 .answer-table td{
   min-width: 160px;
   padding: 1%;
   border-collapse: collapse;
  font-size: 15px;
  vertical-align: text-top;
 } /* 대답 table 스타일 */
  img, .pic_1 {
  display: inline-block;
  padding-left: 20px;
  width: 200px;
  object-fit: contain; /*가로세로 비율을 유지한 채로 사이즈가 조절*/
}
/* -----------------------------------table 서식 */
#planet_table {
  width: 35%;
  margin-left: auto; margin-right: auto; /* 표 가운데로 */
  text-align: center;
  background-color: white;
  border-collapse: collapse; /*선 없애기*/
  border: 0.5px solid lightgray;
  /* box-shadow: 2px 2px 2px lightgray;  */
  cursor: pointer;
}
td {
  padding: 3%;
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