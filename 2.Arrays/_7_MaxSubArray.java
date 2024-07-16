public class _7_MaxSubArray {
    static void printMaxSubArray(int[] arr) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + currentSum) > 0) {
                currentSum += arr[i];
            }
            maxSum = Integer.max(maxSum, currentSum);
        }

        System.out.println(maxSum);

    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, -3 };
        printMaxSubArray(arr);
    }
}
