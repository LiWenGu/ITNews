<template>
    <div class="leftNav">
      <ul>
          <li v-for="i in fListData.entries" :key="1">
            <div>
              <div>
                {{ i.id }}
              </div>
              <div>
                {{ i.title }}
              </div>
            </div>
          </li>
        </ul>
    </div>
</template>

<script>
export default {
  name: 'contentList',
  data () {
    return {

    }
  },
  props: ['fListData']
}
</script>

<style scoped>
.leftNav {
  background-color: #2f5132;
}
</style>


