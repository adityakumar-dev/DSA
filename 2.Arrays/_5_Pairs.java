
//print pairs of arrays
public class _5_Pairs {

    static void printPairs(int arr[]) {
        int tp = 0; // total pairs counter
        for (int i = 0; i < arr.length; i++) {
            // inner loop with basic logic
            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                if (j != arr.length - 1) {
                    System.out.print(",");
                }
                tp++; // increasing the value of total pairs
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printPairs(arr);
    }
}
