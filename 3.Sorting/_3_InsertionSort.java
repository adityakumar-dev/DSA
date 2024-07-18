
public class _3_InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        // outer loop
        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i]; // current value for check;
            int pre = i - 1; // previous index from current
            // finding out correct positions
            while (pre >= 0 && arr[pre] > curr) {
                // shifting elements
                arr[pre + 1] = arr[pre];
                pre--;

            }
            // insertion
            arr[pre + 1] = curr;

        }

        for (int s : arr) {
            System.out.print(s);
        }
    }
}
