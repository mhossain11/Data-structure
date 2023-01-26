package Java_P.List.ArrayList_To_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class AL_Vs_LL {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer>ll = new LinkedList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(5);
        al.add(null);
        al.add(null);

        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        ll.add(55);
        ll.add(55);
        ll.add(null);
        ll.add(null);

        System.out.println(al);
        System.out.println(ll);
    }
}
