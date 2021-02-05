<template>
  <ModalDialog>
      <h3>상세 정보</h3>
      이오는 목성의 제1위성이며, 화산활동이 활발하게 일어나는 것이 그 특징이다.
      <div>
       <button @click="$emit('cancel')">닫기</button>
      </div>

  </ModalDialog>
</template>

<script>
import ModalDialog from './ModalDialog'
export default {
  name: 'UploadDialog1',
  components: { ModalDialog }
}
</script>

<style scoped>
  h3 { margin-top: 0px; }
  div { margin-bottom: 10px; }
  button { padding: 0.4em 1.5em; margin-right: 10px; }
</style>