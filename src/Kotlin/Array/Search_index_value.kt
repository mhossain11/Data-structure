package Kotlin.Array

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    print("Enter size of number :")
    var num = sc.nextInt()
    val A = Array(num){1}


    for (i in 0 until num){
        val ar = sc.nextInt()
        A[i]=ar
    }
    print("Enter number of search: ")
    val found = sc.nextInt()
    for (j in A.indices){
        if (A[j]==found){
            println("index of number:$j")
            println("number of value:${A[j]}")
        }
    }
}