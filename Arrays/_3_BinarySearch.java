public class _3_BinarySearch {
    static int BinarySearch(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + end;
            if (arr[mid] == 10) {
                return mid;
            } else if (arr[mid] > 10) {
                end = (start + end) / 2;
            } else if (arr[mid] < 10) {
                start = (start + end) / 2;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        int index = BinarySearch(arr);
        if (index != -1) {
            System.out.println("Index of key is  : " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
