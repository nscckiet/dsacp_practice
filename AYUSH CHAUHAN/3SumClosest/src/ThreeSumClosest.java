import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println(threesum(nums, target));
        }
    }

    private static int threesum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1, min = Integer.MAX_VALUE, ans = 0;
        while (start < end - 1) {
            int first = nums[start];
            int s = start + 1, e = nums.length - 1;
            while (s < e) {
                int sum = nums[s] + nums[e] + first;
                if (sum == target) {
                    return sum;
                }
                if (sum < target) {
                    s++;
                } else {
                    e--;
                }
                int diff = Math.abs(target - sum);
                if (diff < min) {
                    min = diff;
                    ans = sum;
                }
            }
            start++;
        }
        return ans;
    }
}
