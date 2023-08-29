import java.util.*;
class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        System.out.println(list);
        //Get a element
        int element=list.get(2);
        System.out.println(element);
        //Delete element
        list.remove(2);
        System.out.println(list);
    }
}