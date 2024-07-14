import java.util.Scanner;

//pattern printing half pyramid
public class _2_HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an rows : ");
        int row = sc.nextInt();
        System.out.println("Enter an Column : ");
        int column = sc.nextInt();
        sc.close();

        // outer loop
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (row - j <= i) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println();

    }
}
