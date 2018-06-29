# Kotlin

@(示例笔记本)[Kotlin in Android]

```
//申明一个数据类  构造函数传入两个值
data class Preson(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    //初始化一个集合
    var preson = listOf<Preson>(Preson("xcg", 11), Preson("lh", null))
    println("集合数量:${preson.size}")
    //比较年龄大的
    // ?: Elvis 操作符 左边返回值不为空 就返回自己  否则返回右边
    var oldest = preson.maxBy { it.age ?: 0 }
    //字符串模板
    println("年龄较大的是:$oldest")
}
```
####打印结果
```
集合数量:2
年龄较大的是:Preson(name=xcg, age=11)
```
