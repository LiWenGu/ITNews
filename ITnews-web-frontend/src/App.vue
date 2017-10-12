<template>
  <div id="app">

    <el-row type="flex" justify="center" class="header">
      <el-col :span="18">
        <MyHeader></MyHeader>
      </el-col>
    </el-row>

    <el-row type="flex" justify="center" class="pollingImg">
      <el-col :span="22">
        <PollingImg></PollingImg>
      </el-col>
    </el-row>

    <el-row type="flex" justify="space-around" class="content">
      <el-col :span="14">
        <router-view></router-view>
      </el-col>
      <el-col :span="8">
        <Right></Right>
      </el-col>
    </el-row>

    <MyFooter></MyFooter>

  </div>
</template>

<script>

import MyHeader from '@/components/common/Header'
import PollingImg from '@/components/common/PollingImg'
import MyFooter from '@/components/common/Footer'
import Right from '@/components/common/Right'

export default {
  name: 'app',
  components: {
    MyHeader,
    PollingImg,
    MyFooter,
    Right
  }
}

</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 20px;
}

.header {
  height: 60px;
  background-color: #2f5132;
}

.pollingImg {
  height: 350px;
  padding-top: 25px;
  background-color: #25f214;
}

.content {
  background-color: #5fa24f;
  min-height: 800px;
}
</style>
