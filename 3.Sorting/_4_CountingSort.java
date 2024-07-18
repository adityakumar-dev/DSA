public class _4_CountingSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };

        int range = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            range = Math.max(range, arr[i]);
        }
        int[] helperArray = new int[range + 1];
        for (int i = 0; i < arr.length; i++) {
            helperArray[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < helperArray.length; i++) {
            while (helperArray[i] > 0) {
                arr[j] = i;
                j++;
                helperArray[i]--;
            }
        }
        for (int s : arr) {
            System.out.print(s);
        }
    }
}