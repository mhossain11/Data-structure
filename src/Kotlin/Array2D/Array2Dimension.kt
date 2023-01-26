package Kotlin.Array2D

fun main() {
    val a = arrayOf(arrayOf(1,2,3,4), arrayOf(5,6,7,8))

for (i in 0 until a.size){ // use a nested loop to iterate over the rows and columns
    for (j in 0 until a[i].size){ //a[i]=4
        print("${a[i][j]} ")
    }
    println()
}
    val b = Array(2) { IntArray(3) }  //The first parameter is the size, the second lambda method is for initialisation.
  //  b[0]= arrayOf(1,2,3)
  //  b[1]= arrayOf(4,5,6)

    //  int [][] a = {{10,20,30},{40,50,60}} //declaration,creation,initialization
    b[0][0] = 10
    b[0][1] = 20
    b[0][2] = 30
    b[1][0] = 40
    b[1][1] = 50
    b[1][2] = 60 //10,20,30

    //40,50,60

    //40,50,60
    println(a.size)
 print(b.joinToString(separator = "\n") { it.joinToString() }) // joinToString function to print
}
