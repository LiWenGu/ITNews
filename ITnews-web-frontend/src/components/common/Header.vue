<template>
  <div>
    <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
      <el-menu-item index="1">ITNews</el-menu-item>
      <el-submenu index="2">
        <template slot="title">前端</template>
        <el-menu-item index="2-1">html/html5</el-menu-item>
        <el-menu-item index="2-2">css/css3</el-menu-item>
        <el-menu-item index="2-3">javascript</el-menu-item>
      </el-submenu>
      <el-menu-item index="3">
        <a href="https://www.ele.me" target="_blank">TCP/IP</a>
      </el-menu-item>
      <el-menu-item index="4">
        <a href="https://www.ele.me" target="_blank">Algorithm</a>
      </el-menu-item>
      <el-menu-item index="5">
        <a href="https://www.ele.me" target="_blank">Java</a>
      </el-menu-item>
      <el-menu-item index="6">
        <a href="https://www.ele.me" target="_blank">Python</a>
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: 'header',
  data () {
    return {
      activeIndex: '1'
    }
  },
  methods: {
    handleSelect (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>

<style scoped>

</style>


