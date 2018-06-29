package com.xcg

//区间和循环
fun main(args: Array<String>) {

    //区间
    var num = 1..100  //闭区间
    var result = 0
    for (i in num) {
        result += i
    }
    println(result)

    var nums = 1 until 100   //前闭后开区间

    for (i in nums) {
        println(i)
    }

    //步长
    for (i in num step 10) {
        print("$i ,")
    }
    println()

    //反转
    for (i in num.reversed()) {
        print("$i ,")
    }

println()
    println("总数为:${num.count()}")

}