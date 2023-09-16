import java.util.*;
public class q1{

    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                isIncreasing = false;
            }
            if (nums.get(i) > nums.get(i - 1)) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(5);
        nums2.add(4);
        nums2.add(3);
        nums2.add(2);
        nums2.add(1);

        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(1);
        nums3.add(3);
        nums3.add(2);
        nums3.add(4);
        nums3.add(5);

        System.out.println(isMonotonic(nums1)); // true
        System.out.println(isMonotonic(nums2)); // true
        System.out.println(isMonotonic(nums3)); // false
    }
}
