<template>
  <ModalDialog>
      <h3>상세 정보</h3><br>
      가니메데는 목성의 제3 위성이다. 태양계 위성중 가장 크다. 하지만 얼음과 약간의 암석으로 이루어져 있어 밀도가 수성의 절반 정도이다. 
      <div>
       <button @click="$emit('cancel')" class="btn_shape">닫기</button>
      </div>

  </ModalDialog>
</template>

<script>
import ModalDialog from './ModalDialog'
export default {
  name: 'UploadDialog3',
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