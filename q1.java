import java.util.*;

public class q1 {

    public static boolean mono(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            if (list.get(i) < list.get(i - 1) && list.get(i) > list.get(i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(7);
        System.out.println(mono(list));
    }
}
