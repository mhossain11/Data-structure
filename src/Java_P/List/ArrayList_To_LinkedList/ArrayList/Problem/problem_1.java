package Java_P.List.ArrayList_To_LinkedList.ArrayList.Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int N = scanner.nextInt();


        for (int j = 0; j<=N-1; j++) { //0=1,1=2,2=3,3=4
            int n = scanner.nextInt();
            A.add(n);

        }

        for (int i=A.size()-1;i>=0;i--) { //3=4,2=3,1=2,0=1
            System.out.print(A.get(i)+" ");
        }


    }
}
