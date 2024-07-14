import java.util.Scanner;

//pattern printing half pyramid
public class _3_HalfPyramidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an rows : ");
        int row = sc.nextInt();

        sc.close();
        // outer looop
        for (int i = 1; i <= row; i++) {
            // inner loop
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
