package Java_P.List.ArrayList_To_LinkedList.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Arraylist {

    public static void main(String[]args){
        ArrayList<Integer> A = new ArrayList<>();

        //add elements
        A.add(0,1);
        A.add(1,2);
        A.add(2,3);
        A.add(3,5);

        System.out.println(A);

        //get elements(get data by index)
        System.out.println(A.get(0));

        //add element in between
         A.add(1,1);
        System.out.println(A);

        //set element(replies element)
        A.set(0,5);
        System.out.println(A);

        //delete element
        A.remove(3);
        System.out.println(A);

        //Size
        System.out.println(A.size());

        //loop
        for (int i=0; i<A.size();i++){
            System.out.print(A.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(A);
        System.out.println(A);

        //iterator
        for (Integer integer : A) {
            System.out.println(integer);
        }
        System.out.println();
        //ListIterator
        ListIterator<Integer> a = A.listIterator();
       while (a.hasNext()){
           System.out.println(a.next());
       }
    }

}
