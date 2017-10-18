<template>
  <div>
    <el-row type="flex" justify="start" class="content">
      <el-col :span="4">
        <leftNav></leftNav>
      </el-col>
      <el-col :span="18" class="contentList">
        <contentList :fListData="uListData"></contentList>
      </el-col>
      <el-col :span="2" class="contentPage">
        <pageIndex></pageIndex>
      </el-col>
    </el-row>
  </div>
</template>

<script>

import LeftNav from '@/components/page/content/LeftNav'
import ContentList from '@/components/page/content/ContentList'
import PageIndex from '@/components/page/content/PageIndex'
import axios from 'axios'

export default {
  name: 'itnews',
  components: {
    LeftNav,
    ContentList,
    PageIndex
  },
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  },
  created(){
      axios.get('http://localhost:8081/api/jianshu/list.json?keyword=java&pageNo=1&orderBy=DEFAULT')
      .then(response=>{
         console.log(response);
         this.uListData=response.data;
      })
      .catch(error=>{
          console.log(error);
          // alert('网络错误，不能访问');
      })
  },
  data () {
    return {
      uListData: {
        "q": "java",
        "page": 1,
        "type": "note",
        "total_count": 90714,
        "per_page": 10,
        "total_pages": 100,
        "order_by": "default",
        "entries": [
          {
            "id": 13787883,
            "title": "<em class='search-result-highlight'>Java</em> - 收藏集 - 掘金",
            "slug": "893b21dce761",
            "content": "……<em class='search-result-highlight'>Java</em> 基础思维导图，让 <em class='search-result-highlight'>Java</em> 不再难懂 - 工具资源 - 掘金思维导图的好处 最近看了一些文章的思维导图，发现思维导图真是个强大的工具。了解了思维导图的作用之后，觉得把它运用到<em class='search-result-highlight'>java</em>上应该……是个不错的想法，这样回顾知识点的时候一目了然，快速知道自己的短板。 思维导图不仅仅只有简单明了这个好处，它还能加深人对主题的印象和... 一文让你明白 <em class='search-result-highlight'>Java</em> 字节码 - 后端 - 掘金Intro…… 在这，我们相互学习，共同成长，分享使我们并不孤单. BRVAH@www.recyclerview.org ... 使用示例带你提前了解 <em class='search-result-highlight'>Java</em> 9 中的新特性 - 掘金<em class='search-result-highlight'>Java</em> 作为 Android……",
            "user": {
                "id": 120495,
                "nickname": "掘金官方",
                "slug": "5fc9b6410f4f",
                "avatar_url": "http://upload.jianshu.io/users/upload_avatars/120495/6220dd63-bf1a-40a8-8ccc-e364a5c90f13.png"
            },
            "notebook": {
                "id": 12023435,
                "name": "精选文集推荐"
            },
            "commentable": true,
            "public_comments_count": 0,
            "likes_count": 208,
            "views_count": 4829,
            "total_rewards_count": 0,
            "first_shared_at": "2017-06-23T06:48:15.000Z"
          }
        ]
      }
    }
  }
}
</script>

<style scoped>
.contentList {
  background-color: #f05f6f;
}

.contentPage {
  background-color: #f01f54;
}
</style>


