package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList
{
    public static void main(String[] args) {
        // Wrapper Classes in ArrayLists

        /*
        int i=3;
        Integer val=Integer.valueOf(i);


        ArrayList<Integer> intList=new ArrayList<>();

        intList.add(Integer.valueOf(1));
        intList.add(Integer.valueOf(2));
        intList.add(val);
        intList.add(4);

        for(Integer ints:intList){
            System.out.println(ints+ " ");


        ArrayList<String> arrList1=new ArrayList<>();
        arrList1.add("E1");
        arrList1.add("E2");
        arrList1.add("E3");
        System.out.println(arrList1);
   //     arrList1.forEach(e->System.out.println(e));

        arrList1.remove("E1");
        System.out.println(arrList1);

        arrList1.remove(0);
        System.out.println(arrList1);

        if (arrList1.contains("E3")){
            System.out.println("E3 exists");
        }

        if (arrList1.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }

        */
        //LinkedList
            LinkedList<Integer> lnkList=new LinkedList<>();
            lnkList.add(0);
            lnkList.add(1);
            lnkList.add(2);

            System.out.println(lnkList);
            lnkList.remove(1);
            System.out.println(lnkList);
            lnkList.clear();

            lnkList.offer(0);
            lnkList.offer(1);
            lnkList.offer(2);
            lnkList.offer(1);
            System.out.println(lnkList);
            System.out.println(lnkList.poll());
            System.out.println(lnkList);
       // }

    }


}
