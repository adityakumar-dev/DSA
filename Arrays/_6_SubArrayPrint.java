public class _6_SubArrayPrint {
    // function for print subArray
    static void printSubArrau(int[] arr) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        // outer loop
        for (int i = 0; i < arr.length; i++) {
            // inner loop
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;

                // loop with logic implementation
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    currentSum += arr[k];
                }
                System.out.print(", ");
                System.out.print("Sum : " + currentSum + " ,");
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
            System.out.println("Max sum is : " + maxSum);

        }
    }

    static void prefixSum(int[] arr) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        int[] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];

        // Calculate the prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }

        // Calculate the maximum subarray sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = prefixArr[j] - (i > 0 ? prefixArr[i - 1] : 0);

                System.out.print(currentSum + " ");
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 3, 5, 6, 7 };
        int[] arr = { 1, -2, 6, -1, 3 };
        // printSubArrau(arr);
        prefixSum(arr);
    }
}
