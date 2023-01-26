package Java_P.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[]args){
      //  int [] list = new int[5]; //Must be told total store size
      //  int  list [] = new int[5]; //Must be told total store size
     //   int  list [] = {1,2,3,4,5};
        Scanner Sn = new Scanner(System.in);
        int size= Sn.nextInt();
        int [] list = new int [size];

        for (int i=0;i<list.length;i++){
             list [i] = Sn.nextInt();
        }
        System.out.println();
        for (int j=0;j<list.length;j++){
            System.out.print(list[j]);
        }




     /*   list[0]=1;
        list[1]=2;
        list[2]=3;
        list[3]=4;
        list[4]=5;*/


    }
}
