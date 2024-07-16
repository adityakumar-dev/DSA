public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 17;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("key : " + key + " at index : " + i);
                break;
            } else if (i == arr.length - 1) {
                System.out.println("key not found !");

            }
        }
    }
}
