import java.util.Scanner;

public class _5_FlOyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter an num : ");
        int row = sc.nextInt();
        sc.close();
        // outer loop
        for (int i = 0; i < row; i++) {
            // inner loop print counter with increment
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
