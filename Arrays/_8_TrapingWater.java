public class _8_TrapingWater {
    static void trapingWaterCalculate(int[] arr) {
        int[] lefthelperArray = new int[arr.length];
        int[] rightHelperArray = new int[arr.length];
        lefthelperArray[0] = arr[0];
        int length = arr.length;
        rightHelperArray[length - 1] = arr[length - 1];
        for (int i = 1; i < length; i++) {
            lefthelperArray[i] = Integer.max(lefthelperArray[i - 1], arr[i]);
        }
        for (int i = length - 2; i >= 0; i--) {
            rightHelperArray[i] = Integer.max(rightHelperArray[i + 1], arr[i]);
        }
        int totalWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int minBar = Integer.min(lefthelperArray[i], rightHelperArray[i]);
            totalWater += minBar - arr[i];
        }
        System.out.println(totalWater);
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        trapingWaterCalculate(height);
    }
}
