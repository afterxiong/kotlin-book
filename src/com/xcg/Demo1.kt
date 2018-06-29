package com.xcg

//data  数据类   Int?=null 可以为null类型
data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    println(m4(10))
}


// is 类型匹配
fun m4(a: Any): Boolean {
    return a is Int
}

//表达式函数体  可去掉花括号和 return关键字
fun m3(a: Int, b: Int): Int = if (a > b) a else b


//if 结果表达式
fun m2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun m1() {
    val person = listOf(Person("xcg", null), Person("tom", 11))
    // ?: Elvis 操作符 左边返回值不为空 就返回自己  否则返回右边
    val oldest = person.maxBy { it.age ?: 0 }
    println("the oldest is : $oldest")
}