import java.util.*;
public class max{
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(-145);
        list.add(1000000);
        list.add(2);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("Maximum element is "+max);

    }
}