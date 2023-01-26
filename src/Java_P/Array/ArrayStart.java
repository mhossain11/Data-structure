package Java_P.Array;

public class ArrayStart {
    public static void main(String[] args) {
        String [] a = new String[1];
        a[0]="Kamal";
       /* a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;*/
        //null not allow

        System.out.println(a.length);

        for (String i : a){
            System.out.print(i+" ");
        }



    }
}
