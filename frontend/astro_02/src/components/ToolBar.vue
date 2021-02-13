<template>
  <div>
      <nav>
        <ul class="mainbar">
         <li class="list-home">
           <router-link to="/home">
          <i class="fas fa-home fa-lg"></i>
          </router-link></li>

          <li class="dropdown"><router-link to="/home">개요</router-link></li>

          <div class="dropdown">
          <li class="dropdown-button1"><router-link to="/planet">행성 이야기</router-link></li>
            <div class="dropdown-content">
              <router-link to="/planet">지구형 행성</router-link>
              <router-link to="/planet2">가스형 행성</router-link>
            </div>
          </div>

          <div class="dropdown">
          <li class="dropdown-button2"><router-link to="/satellite2">위성 이야기</router-link></li>
            <div class="dropdown-content">
              <router-link to="/satellite2">목성의 위성</router-link>
              <router-link to="/satellite">달</router-link>
            </div>
          </div>

          <!-- <div class="dropdown">
          <li class="dropdown-button3"><router-link to="/quiz">퀴즈</router-link></li>
          <div class="dropdown-content">
              <a href="#">참여 방법</a>
              <a href="#">문제 풀기</a>
            </div>
          </div> -->

          <div class="dropdown">
          <li class="dropdown-button4"><router-link to="/list">게시판</router-link></li>
          <div class="dropdown-content">
            <a href="http://localhost:8089/departments.html">2</a>
            </div>
          </div>

    
          <!-- <form class='search'>
             <input class = "keyword" type = 'text' name = 'search' maxlength= 200 value="" autocomplete="off">

            <button class = "img-button" type = "submit" name = "click" value = "">
              <i class="fas fa-search"></i>
            </button>
          </form> -->
        </ul>
      </nav>
  </div>
</template>

<script>
export default {
}
</script>

<style scoped>
.mainbar{
  /* background: rgb(151, 97, 151); */
  /* background: rgb(161, 199, 212); */
  background: rgb(125, 157, 168);
  display: flex;
  flex-direction: row;
  margin: 0;
  list-style-type: none;
  position: relative;
}
a {
  width: 90px;
  padding-left: 30px;
  padding-right: 30px;
  cursor: pointer;
  color: white;
  text-decoration: none; 
  /* 밑줄제거 */
  display: block;
  text-align: center;
  padding-bottom: 15px;
  padding-top: 20px; 
  /* a 태그 넓이 늘리기*/
}

/* 마우스 호버시 밑줄 그리기 시작*/
.dropdown:after {    
  background: none repeat scroll 0 0 transparent;
  bottom: 0;
  content: "";
  display: block;
  height: 3px;
  left: 50%;
  position: absolute;
  background: lightgoldenrodyellow;
  transition: width 0.3s ease 0s, left 0.3s ease 0s;
  width: 0;
}
.dropdown:hover:after { 
  width: 100%; 
  left: 0; 
}
/* 마우스 호버시 밑줄 그리기 끝*/

.list-home{
  padding-right: 100px;
  padding-left: 50px;
}

/*--------------------------------여기서부터 드랍다운 네비바*/
.dropdown {
  position: relative;
  display: inline-block;
}
.dropdown-content a {
  color: white;
  text-align: center;
  text-decoration: none;
  display: block;
  padding-top: 6%;
  padding-bottom: 6%;
}
/* 세부 컨텐츠 마우스 올렸을 때 색깔*/
.dropdown-content a:hover {
  /* background-color: blueviolet; */
  background-color: lightblue;
  /* background-color: rgb(150, 203, 221); */
  /* background-color: #f1f1f1; */
}

.dropdown:hover .dropdown-content {
  display: block;
}
/*세부 내용 배경*/
.dropdown-content {
  display: none;
  position: absolute;
  background-color: rgb(125, 157, 168);
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
/* form {
  padding-left: 5%;
	margin-top: 1%;
} */
.search {
  color: white;
  padding: 2px;
  vertical-align: middle;
  /* background-color: darkgray; */
}
</style>