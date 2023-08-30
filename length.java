import java.util.*;
public class length{
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(16);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}