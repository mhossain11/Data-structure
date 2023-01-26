package Java_P.List.ArrayList_To_LinkedList.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class p_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();


        for (int i=0;i<=N-1;i++){
            int n = scanner.nextInt();
            A.add(i,n);
        }

        for (int j= A.size()-1;j>=0;j--){
            System.out.print(A.get(j)+" " );
        }


    }
}
