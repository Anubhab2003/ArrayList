import java.util.*;
public class swap{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(100);
        list.add(-145);
        list.add(1000000);
        list.add(2);
        System.out.print("inter index of two element to be swapped");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int temp=list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
        System.out.print(list);
    }
}
