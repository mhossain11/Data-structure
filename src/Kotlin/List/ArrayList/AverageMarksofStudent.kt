package Kotlin.List.ArrayList

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var store =0
    val A = ArrayList<Int>()
    print("Enter number of student: ")
    val st:Int = sc.nextInt()

    for (i in 0 until  st){
        val mark = sc.nextInt()
        A.add(mark)
    }

    for (j in A){
        store +=j
    }
        store /=st

    println(store)
}