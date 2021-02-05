<template>
  <ModalDialog>
      <h3>상세 정보</h3><br>
      가니메데
      <div>
       <button @click="$emit('cancel')">닫기</button>
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
</style>