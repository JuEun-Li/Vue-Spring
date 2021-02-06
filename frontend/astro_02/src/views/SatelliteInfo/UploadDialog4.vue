<template>
  <ModalDialog>
      <h3>상세 정보</h3><br>
        칼리스토는 목성의 제4 위성이다. 핵 부분은 거의 암석으로 되어 있으나, 그 표면은 암석 물질이 포함된 검은 얼음으로 덮여 있다. 칼리스토의 표면에는 큰 크레이터들이 많이 있다. 
      <div>
       <button @click="$emit('cancel')" class="btn_shape">닫기</button>
      </div>

  </ModalDialog>
</template>

<script>
import ModalDialog from './ModalDialog'
export default {
  name: 'UploadDialog4',
  components: { ModalDialog }
}
</script>

<style scoped>
  h3 { margin-top: 0px; }
  div { margin-bottom: 10px; }
  button { padding: 0.4em 1.5em; margin-right: 10px; }

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
</style>