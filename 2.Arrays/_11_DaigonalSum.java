public class _11_DaigonalSum {
    public static void main(String[] args) {
        int primaryDaigonalSum = 0;
        int bDaigonalSum = 0;
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        for (int i = 0; i < arr.length; i++) {
            primaryDaigonalSum += arr[i][i];
            if ((arr.length - i - 1) != i)
                bDaigonalSum += arr[i][arr.length - i - 1];

        }
        System.out.println("primary Daigonal : " + primaryDaigonalSum + " bDaigonal : " + bDaigonalSum);
    }
}
