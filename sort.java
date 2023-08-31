import java.util.*;
public class sort{
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1000);
        list.add(-1000);
        list.add(94);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}