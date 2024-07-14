import java.util.Scanner;

public class _8_SolidRhombus_Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an num : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            // print spaces : -
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print * : -
            // Rhombus logic
            // for (int j = 0; j < n; j++) {
            // System.out.print("*");
            // }
            // Hollow Rhombus logic
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
