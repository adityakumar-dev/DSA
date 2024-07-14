import java.util.Scanner;

public class _10_PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an num : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            // spaces print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            // print numbers : descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // print numbers : ascending

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
