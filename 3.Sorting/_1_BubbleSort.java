public class _1_BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        // outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            // inner loop checking the greater element and swaping into last position
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {

                    // swaping
                    arr[j - 1] += arr[j];
                    arr[j] = arr[j - 1] - arr[j];
                    arr[j - 1] = arr[j - 1] - arr[j];
                }

                // printing element
                for (int s : arr) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        for (int s : arr) {
            System.out.print(s + " ,");
        }
    }
}
