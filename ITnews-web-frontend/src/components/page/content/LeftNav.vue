<template>
    <div class="leftNav">
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
    </div>
</template>

<script>
export default {
  name: 'leftNav',
  data () {
    return {

    }
  }
}
</script>

<style scoped>
.leftNav {
  background-color: #2f5132;
}
</style>


