//package Kotlin.Array

fun main() {
    //val a = arrayOf(arrayOf(1,2,3,4), arrayOf("we","ee"))
    val b  = arrayOf(1,null,0,4,5)
    val z  = arrayOf(1,null,0,4,5,"kamal")
    val c = IntArray(1)
    val a = arrayOfNulls<String>(1)
    val d = Array(3){""}//size and Lambda function type
    d[0]= "kamal"
    d[1]= "kamal"
    d[2]= "kamal"
    /* c[1]=2
     c[2]=3
     c[3]=4*/
    //c[4]=5 //not possible
    print(d)


    b[2] = 3 //replace
    //b.set(2,3)  //replace
    println("\nB=${b.size}")
    println("\nC=${c.size}")
    println("\nA=${a.size}")
    println("\nD=${d.size}")

    for (i in d){
        print(i )
    }




}