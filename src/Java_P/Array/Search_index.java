package Java_P.Array;

import java.util.Scanner;

public class Search_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] list = new int[size];

        for (int i=0;i<list.length;i++){
            list[i]=sc.nextInt();
        }

        int search =sc.nextInt();
        for (int j=0;j<list.length;j++){ // linear search
            if (list[j]==search){
                System.out.println("Search found at index: "+j );
                System.out.println("Search found at element: "+list[j] );
            }
        }


    }
}
