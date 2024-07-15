public class _2_findMaxMinNumber {
    public static void main(String[] args) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int[] numbers = { 1, 2, 3, 4, 5, 12, 15, 6, 16 };

        for (int i = 0; i < numbers.length; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        System.out.println("Max Value is : " + maxValue);
        System.out.println("Min Value is : " + minValue);

    }

}
