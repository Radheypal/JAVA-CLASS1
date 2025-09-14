package arraylist;

import java.util.*;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("------List-------");
        System.out.println(list);

        list.add(2,10);
        System.out.println("-------iterator-------");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        list.set(3,5);
        list.remove(2);
        //we have to know type
        System.out.println("--------foreach--------");
        for(Integer s:list){
            System.out.println(s);
        }
        System.out.println("size = " + list.size());
        
        //sorting
        
    }

}