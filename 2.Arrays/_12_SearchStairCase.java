public class _12_SearchStairCase {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int row = 0;
        int key = 33;
        int column = arr[0].length - 1;
        while (row < arr.length && column >= 0) {
            if (arr[row][column] == key) {
                System.out.println("Key found at : " + row + " " + column);
                break;
            } else if (arr[row][column] > key) {
                column--;
            }

            else if (arr[row][column] < key) {
                row++;
            }
        }
    }

}
