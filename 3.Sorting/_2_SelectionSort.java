public class _2_SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        // outer loop for insertion sort
        for (int i = 0; i < arr.length - 1; i++) {
            // print current element status
            for (int s : arr) {
                System.out.print(s + " ");
            }
            // first element position for check ;
            int postitions = i;

            // caluclating the lower then position index value
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[postitions] > arr[j]) {
                    postitions = j;
                }
            }
            // swaping lower value to greater
            arr[postitions] += arr[i];
            arr[i] = arr[postitions] - arr[i];
            arr[postitions] = arr[postitions] - arr[i];
            System.out.println();
        }
        for (int s : arr) {
            System.out.print(s + " ");
        }
    }
}
