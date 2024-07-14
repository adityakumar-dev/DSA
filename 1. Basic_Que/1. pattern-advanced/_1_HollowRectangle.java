import java.util.Scanner;

//pattern printing hollow reactangle
public class _1_HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an rows : ");
        int row = sc.nextInt();
        System.out.println("Enter an Column : ");
        int column = sc.nextInt();
        sc.close();

        // outer loop for rows
        for (int i = 1; i <= row; i++) {
            // inner loop for columns
            for (int j = 1; j <= column; j++) {
                // basic logic for print the pattern
                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            // new line after each row completion
            System.out.println();

        }
    }
}
