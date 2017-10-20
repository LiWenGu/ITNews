
---

##### 项目介绍

使用爬虫爬取关于IT的各种文章并持久化到数据库，接着从数据库里取出，并展示。方便知识的集中获取

---

##### 项目技术点

整体框架：springboot  
持久化框架：mybatis  
爬虫框架：webmagic（没有枪没有炮，敌人跟我造！）  
前端框架：vue2  
前端UI框架：Element  
配置管理：zookeeper（将所有账号密码放在zk上）
数据库：MySQL

---

##### 开发指导

前端：在 ITnews-web-frontend 子项目下进行开发
后端分两种，一种原生从数据库取，另一种是爬到数据存取数据库
>原生：  
在 ITnews-api、ITnews-service、ITnews-dao 子项目下进行开发接口  
>爬虫：  
在 ITnews-spider 子项目开发，结合 ITnews-service 存储到对应数据库，以提供给 ITnews-api 抽取并转换为方便的接口供前端调用

---

##### 当前进度

目的1：每天定时爬简书技术类的文章，分类后存储到数据库中，最后网站展示出来。  
- [x] 整合springboot+mybatis+webmagic  
- [x] 跑通爬数据-存数据-取数据流程  
- [x] 前端UI实现（卡在这里了，可能花一个国庆的时间把前端搞明白）  
- [ ] 前端分页并分类的展示爬出的数据    
- [ ] 将敏感数据配置到zookeeper中  
- [ ] 优化代码  
- [ ] 大吉大利，今晚吃鸡！  

