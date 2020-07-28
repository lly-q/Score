#KotlinScore
=======================
##此项目为篮球计分板  
*参考自B站UP主[longway777](https://space.bilibili.com/137860026)  
*教程视频：[https://www.bilibili.com/video/BV1A4411u7Va](https://www.bilibili.com/video/BV1A4411u7Va)  
##更新  
*使用ViewModelProvider替代已经过时的ViewModelProviders  
###Java用法：  
```kotlin
myViewModel = ViewModelProvider.AndroidViewModelFactory(application).create(MyViewModel::class.java) // kotlin 
```
---------------------------------------------------------
##补充  
*不需要再对Gradle添加矢量图标支持
