package Java_P.List.ArrayList_To_LinkedList.ArrayList;

import java.util.Scanner;

public class AverageMarksOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int store = 0;

        int n = sc.nextInt();
       int [] marks = new int[n]; // integer array

        for (int i=0; i<marks.length;i++){
            marks[i] = sc.nextInt();
        }

        for (int j=0;j<n;j++){
            store+= marks[j];
        }
        store/=n;
        System.out.println( "Average Mark:"+ store);

    }
}
