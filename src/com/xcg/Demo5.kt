package com.xcg

fun main(array: Array<String>) {
    println(add(10, 2))
    var i = { x: Int, y: Int -> x + y }
    println(i)

    var c : (Int , Int)-> Int={ x, y -> x + y }

}

fun add(x: Int, y: Int) = x + y