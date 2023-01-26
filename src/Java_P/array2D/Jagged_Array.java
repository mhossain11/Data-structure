package Java_P.array2D;

public class Jagged_Array {
    public static void main(String[] args) {
        // int [][]a= {{10,20,30,40},{50,60,70}};//declaration,creation,initialization
      int [][]a =new int [2][]; //row=2
      a[0]= new int[4];//row=1 and columns =4
      a[1]= new int[3];//row=2 and columns =3
     // a[2]= new int[5];//row=3 and columns =5

      a[0][0]=1; //add value
      a[0][1]=2;
      a[0][2]=3;
      a[0][3]=4;
      a[1][0]=5;
      a[1][1]=6;
      a[1][2]=7;


        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
