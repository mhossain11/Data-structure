package Java_P.array2D;

public class Array_2Dimension {
    public static void main(String[] args) {
        int [][] a = new int [2][3];
      //  int [][] a = {{10,20,30},{40,50,60}} //declaration,creation,initialization

         a[0][0]=10;
         a[0][1]=20;
         a[0][2]=30;
         a[1][0]=40;
         a[1][1]=50;
         a[1][2]=60;//10,20,30
                    //40,50,60

        System.out.println(a.length);

        for (int i=0;i<a.length;i++){
            for (int j=0;j< a.length+1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
