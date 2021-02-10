<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<template>
 <div id="app">
    <div id="main">
      <h1> 학과목록</h1>
      <button type="button" v-on:click="create"> 추가</button>
      <table>
        <tr>
          <td>id</td>
          <td>학과명</td>
          <td>단축명</td>
          <td>전화</td>
        </tr>
        <tr v-for="department in departments" v-on:click="edit(department)" 
                                              v-bind:key="department.id" class="clickable">
          <td>{{ department.id }}</td>
          <td>{{ department.name }}</td>
          <td>{{ department.shortName }}</td>
          <td>{{ department.phone }}</td>
        </tr>
      </table>
    </div>
    
    <div id="backdrop" v-if="showDialog"></div>
    <div id="dialog" v-if="showDialog">
      <h1>학과정보 {{ showDialog }}</h1>
      <label>학과명</label>
      <input type="text" v-model.trim="department.name" placeholder="학과명"/>
      <label>단축명</label>
      <input type="text" v-model.trim="department.shortName" placeholder="단축명"/>
      <label>전화번호</label>
      <input type="text" v-model.trim="department.phone" placeholder="전화번호"/>
      <div>
        <button type="button" v-on:click="save"> 저장</button>
        <button type="button" v-on:click="remove"> 삭제</button>
        <button type="button" v-on:click="showDialog = false"> 취소</button>
      </div>
    </div>    

  </div>
 
</template>

<script>

  

export default {
   el: '#app',
      data: {
        departments: [],
        department: {},
        showDialog: false
      },
      methods: {
        created: function() {
          this.showDialog = "등록";          ;
          this.department = {};
        },
        reload: function() {
          axios.get('departments')
               .then(response => this.departments = response.data );
        },
        edit: function(department) {
          this.showDialog = "수정";
          this.department = Object.assign({}, department);
        },
        save: function() {
          if (this.showDialog == "등록")
            axios.post('department', this.department)
                 .then(response => this.reload());
          else
            axios.put('department', this.department)
                 .then(response => this.reload());
          this.showDialog = false;
        },
        remove: function() {
          if (confirm("삭제하시겠습니까?") == false) return;
          axios.delete('department/' + this.department.id)
                 .then(response => this.reload());
          this.showDialog = false;
        }
      }
}
    window.onload = function() {
      app.reload();
    }
</script>

<style scoped>
button { padding: 0.4em 1.5em; }
table { border-collapse: collapse; margin-bottom: 20px; width: 100%; }
tr:nth-child(1) { background-color: #ddd; }
tr.clickable:hover { background-color: #ffb; cursor: pointer; }
td { padding: 8px;  border: 1px solid #aaa; }

/* main */
div#main { padding: 30px; margin: 30px auto; max-width: 800px;
  border: 1px solid #ccc; box-shadow: 3px 3px 3px #aaa; }
div#main h1 { border-bottom: 1px solid gray; }
div#main button { float: right; margin-bottom: 5px; }

/* dialog */
div#backdrop { position: absolute; left: 0; top: 0; width: 100%; height: 100%;
  background-color: #aaa; opacity: 0.5; }
div#dialog { position: absolute; top: 50px; left: 50%;
  padding: 30px; margin-left: -250px; max-width: 500px;
  background-color: white;
  border: 1px solid #ccc; box-shadow: 4px 4px 4px #666; }
div#dialog h1 { border-bottom: 1px solid gray; }
div#dialog input { padding: 5px; width: 100%; margin-bottom: 20px; font-size: 10pt; }
</style>