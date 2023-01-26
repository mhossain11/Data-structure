package Kotlin.List.ArrayList.Problem

import java.util.Scanner

fun main(){
val scanner = Scanner (System.`in`)
    var N= scanner.nextInt()

   val A = ArrayList<Int>()
    for (i in 0 until N){
        var  n = scanner.nextInt()
        A.add(n) //declaring

    }
    for (j in A.size-1 downTo 0){
        print("${A[j]}")
    }

}