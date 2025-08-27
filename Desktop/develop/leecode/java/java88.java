import java.util.Arrays;

public class java88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] sum = new int[m + n];
        for (int i = 0; i < m; i++) {
            sum[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            sum[m + i] = nums2[i];
        }
        Arrays.sort(sum);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = sum[i];
        }

    }

    public static void main(String[] args) {
        java88 solution = new java88();

        int[] nums1 = { 1, 3, 5, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 4, 6 };
        int n = 3;

        solution.merge(nums1, m, nums2, n);
        System.out.println("result ist : ");
        for (int num : nums1) {
            System.out.println(num + " ");
        }
    }

}
