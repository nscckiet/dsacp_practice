import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// https://leetcode.com/problems/3sum/
public class ThreeSum {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(threesum(nums));
        }
    }

    private static List<List<Integer>> threesum(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        Set<List<Integer>> mySet = new HashSet<>();
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        while (start < end - 1) {
            int first = nums[start];
            int s = start + 1, e = nums.length - 1, sum = 0;
            while (s < e) {
                sum = nums[s] + nums[e] + first;
                if (sum == 0) {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(first);
                    innerList.add(nums[s]);
                    innerList.add(nums[e]);
                    mySet.add(innerList);
                    e--;
                    s++;
                } else if (sum > 0) {
                    e--;
                } else if (sum < 0) {
                    s++;
                }
            }
            start++;
        }
        myList.addAll(mySet);
        return myList;
    }
}
