package com.xcg

//case 关键字
fun gradeStudent(score: Int) {
    when (score) {
        10 ->
            println("henhao")
        9 ->
            println("bucuo")
        8 ->
            println("haikeyi")
        else ->
            println("xuyaonli")
    }
}

fun main(args: Array<String>) {
    gradeStudent(10)
}