public class _8_TrapingWater {
    static void trapingWaterCalculate(int[] arr) {
        // logic
        /*
         * Calculate the left max boundary - array
         * Calucalte the right max boundary - array
         * looop
         * trapingWater += Math.Min(leftMaxBoundary[index] ,
         * rightMaxBoundary[index]) - height[i] ;
         */

        // left array logic
        int[] lefthelperArray = new int[arr.length];
        lefthelperArray[0] = arr[0];
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            lefthelperArray[i] = Integer.max(lefthelperArray[i - 1], arr[i]);
        }
        // right array logic
        int[] rightHelperArray = new int[arr.length];
        rightHelperArray[length - 1] = arr[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            rightHelperArray[i] = Integer.max(rightHelperArray[i + 1], arr[i]);
        }

        // total water variable for store the area
        int totalWater = 0;
        for (int i = 0; i < arr.length; i++) {
            // calculating minimumbar
            int minBar = Integer.min(lefthelperArray[i], rightHelperArray[i]);
            totalWater += minBar - arr[i];
        }
        System.out.println(totalWater);
    }

    public static void main(String[] args) {
        // int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int[] height = { 1, 2, 3, 4, 5, 6, 7 };
        trapingWaterCalculate(height);
    }
}
