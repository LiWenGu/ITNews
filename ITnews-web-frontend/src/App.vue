<template>
  <div id="app">

    <Header></Header>
    
    <PollingImg></PollingImg>

    <el-row class="content">
      <router-view></router-view>
      <Right></Right>
    </el-row>
    
    <Footer></Footer>

  </div>
</template>

<script>

import Header from '@/components/common/Header'
import PollingImg from '@/components/common/PollingImg'
import Footer from '@/components/common/Footer'
import Right from '@/components/common/Right'

export default {
  name: 'app',
  components: {
    Header,
    PollingImg,
    Footer,
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

.content {
  background-color: #5fa24f;
  min-height: 800px;
}
</style>
