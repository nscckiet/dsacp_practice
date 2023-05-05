
// https://leetcode.com/problems/container-with-most-water/
import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < height.length; i++) {
                height[i] = sc.nextInt();
            }
            System.out.println(maxArea(height));
        }
    }

    private static int maxArea(int[] height) {
        int start = 0, end = height.length - 1, arrMax = 0, len = 1;
        while (start != end) {
            if (height[start] == 0) {
                start++;
                continue;
            } else if (height[end] == 0) {
                end--;
                continue;
            } else {
                if (height[start] <= height[end]) {
                    len = height[start];
                } else {
                    len = height[end];
                }
                int area = len * (end - start);
                arrMax = Math.max(arrMax, area);
                if (height[start] < height[end]) {
                    start++;
                } else if (height[start] > height[end]) {
                    end--;
                } else {
                    if (height[start + 1] < height[end - 1]) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return arrMax;
    }
}
