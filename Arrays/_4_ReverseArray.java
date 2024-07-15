public class _4_ReverseArray {
    static void sortReverse(int[] arr) {
        int front = 0, end = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[front] != arr[end]) {
                arr[front] += arr[end];
                arr[end] = arr[front] - arr[end];
                arr[front] -= arr[end];
                front++;
                end--;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 8, 12 };
        sortReverse(arr);
        for (int h : arr) {
            System.out.print(h + " ");
        }
    }
}
