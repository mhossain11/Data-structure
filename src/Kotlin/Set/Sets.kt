package Kotlin.Set


fun main() {
    var s = setOf<Int>(1,2,3,4,5,6,6) //not add


    println(s) //can not use duplicate element
    s.forEach{ println(it) }


}