package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {
        Set<Integer> hset =new HashSet<>();
        hset.add(25);
        hset.add(5);
        hset.add(5);
        hset.add(12);

        System.out.println(hset);

        //Treeset
        Set<Integer> tset=new TreeSet<>();
        tset.add(25);
        tset.add(5);
        tset.add(5);
        tset.add(12);
        System.out.println(tset);
    }
}
