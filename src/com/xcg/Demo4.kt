package com.xcg
fun main(args:Array<String>){
    var lists= listOf("java","kotlin","rxjava")

    for ((i,e) in lists.withIndex()){
        println("$i $e")
    }
}