<template>
  <div>
      <nav>
        <ul class="mainbar">
         <li class="list-home"><router-link to="/home"><i class="fas fa-home fa-lg"></i></router-link></li>

          <li class="list"><router-link to="/home">개요</router-link></li>

          <div class="dropdown">
          <li class="dropdown-button1"><router-link to="/planet">행성 이야기</router-link></li>
            <div class="dropdown-content">
              <router-link to="/planet">지구형 행성</router-link>
              <router-link to="/planet">가스형 행성</router-link>
            </div>
          </div>

          <div class="dropdown">
          <li class="dropdown-button2"><router-link to="/satellite">위성 이야기</router-link></li>
            <div class="dropdown-content">
              <a href="#">달</a>
              <a href="#">타이탄</a>
              <a href="#">유로파</a>
            </div>
          </div>

          <div class="dropdown">
          <li class="dropdown-button3"><router-link to="/quiz">퀴즈</router-link></li>
          <div class="dropdown-content">
              <a href="#">참여 방법</a>
              <a href="#">문제 풀기</a>
            </div>
          </div>

          <div class="dropdown">
          <li class="dropdown-button4"><router-link to="/board/list">게시판</router-link></li>
          <div class="dropdown-content">
            </div>
          </div>

           <!-- <form name= "fo" method="get">
					<input type="text" size="20" value="" id = "name">
          <input type="submit" value=""><i class="search fas fa-search"></i> </form> -->
					
          <form class='search'>
             <input class = "keyword" type = 'text' name = 'search' maxlength= 200 value="" autocomplete="off">

            <button class = "img-button" type = "submit" name = "click" value = "">
              <i class="fas fa-search"></i>
            </button>
          </form>
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
  background: black;
  display: flex;
  flex-direction: row;
  margin: 0;
  list-style-type: none;
  /* position: fixed; */
  position: relative;
  /* width: 100%; */
}
a {
  padding-right: 80px;
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
  padding: 8px;
  text-decoration: none;
  display: block;
}
.dropdown-content a:hover {
  /* background-color: blueviolet; */
  background-color: darkgray;
  /* background-color: #f1f1f1; */
}
.dropdown:hover .dropdown-content {
  display: block;
}
.dropdown-content {
  display: none;
  position: absolute;
  background-color: black;
  min-width: 120px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
form {
  padding-left: 5%;
	margin-top: 1%;
}
.search {
  color: white;
  padding: 2px;
  vertical-align: middle;
  /* background-color: darkgray; */
}
</style>