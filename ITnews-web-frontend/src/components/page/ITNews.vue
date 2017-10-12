<template>
  <div>
    <el-row type="flex" justify="start" class="content">
      <el-col :span="4">
        <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose">
          <el-menu-item index="1">
            <i class="el-icon-menu"></i>最近时间
          </el-menu-item>
          <el-menu-item index="2">
            <i class="el-icon-menu"></i>最多评论
          </el-menu-item>
          <el-menu-item index="3">
            <i class="el-icon-setting"></i>最多喜欢
          </el-menu-item>
          <el-menu-item index="4">
            <i class="el-icon-setting"></i>最强作者
          </el-menu-item>
          <el-menu-item index="5">
            <i class="el-icon-setting"></i>本周最热
          </el-menu-item>
          <el-menu-item index="6">
            <i class="el-icon-setting"></i>本月最热
          </el-menu-item>
          <el-menu-item index="7">
            <i class="el-icon-setting"></i>历史最热
          </el-menu-item>
        </el-menu>
      </el-col>
      <el-col :span="20">
        <ul>
          <li v-for="i in 20" :key="i">
            <div>
              <div>
                标题
              </div>
              <div>
                简介
              </div>
            </div>
          </li>
        </ul>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'itnews',
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>

<style scoped>

</style>


