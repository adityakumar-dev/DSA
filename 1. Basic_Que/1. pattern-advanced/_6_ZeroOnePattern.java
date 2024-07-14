import java.util.Scanner;

public class _6_ZeroOnePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an num : ");
        int row = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            // inner loop with even and odd logic
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);

                } else {
                    System.out.print(0);

                }
            }
            System.out.println();
        }
    }
}
