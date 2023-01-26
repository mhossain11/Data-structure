package Kotlin.Array2D

fun main() {
    //0ne
    val a = Array(2) { IntArray(0) }
    //two
  //  val a = arrayOfNulls<IntArray>(2)//row=2
    a[0] = IntArray(4) //row=1 and columns =4
    a[1] = IntArray(3) //row=2 and columns =3
  //  a[1] = IntArray(5) //row=3 and columns =5

    //0ne
    a[0][0] = 1 //add element
    a[0][1] = 2
    a[0][2] = 3
    a[0][3] = 4
    a[1][0] = 5
    a[1][1] = 6
    a[1][2] = 7

    //two
    /*a[0]!![0] = 1 //add element
    a[0]!![1] = 2
    a[0]!![2] = 3
    a[0]!![3] = 4
    a[1]!![0] = 5
    a[1]!![1] = 6
    a[1]!![2] = 7*/



    println(a.size)
// loops iterator
    for (i in a.indices) {
        for (j in a[i]!!.indices) {
            print(a[i]!![j].toString() + " ")
        }
        println()
    }


}