package Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class MainMap {

    public static void main(String[] args) {
        HashMap<String,String> StudentIds=new HashMap<>();
        StudentIds.put("ID001","Alex Smith");
        StudentIds.put("ID002","John Cage");
        System.out.println(StudentIds.keySet());
        System.out.println(StudentIds.values());
        System.out.println(StudentIds.entrySet());

        String studentName=StudentIds.get("ID001");

        if (StudentIds.containsKey("ID001")){
            System.out.println("The first student is " + studentName);
        }

        TreeMap<String,Integer> KeysMap=new TreeMap<>();
        KeysMap.put("K1",30);
        KeysMap.put("K3",10);
        KeysMap.put("K2",20);
        System.out.println(KeysMap);




    }
}
