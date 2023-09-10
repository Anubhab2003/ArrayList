import java.util.*;
public class zeron{
    public static boolean check(ArrayList<Integer> list,int tar){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==tar){
                return true;
            }if(list.get(lp)+list.get(rp)<tar){
                lp++;
            }else{
                rp--;
            }

        }
        
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        int tar=8;
        if (check(list, tar)) {
        System.out.println("Pair found that sums up to " + tar);
        } else {
        System.out.println("No pair found that sums up to " + tar);
    }
    }
}
