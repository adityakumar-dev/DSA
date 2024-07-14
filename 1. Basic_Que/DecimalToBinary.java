import java.util.Scanner;

public class DecimalToBinary {
    public static void printBinary(int num) {
        int binaryValue = 0;
        int count = 0;
        while (num != 0) {
            int temp = num % 2;

            binaryValue += temp * Math.pow(10, count);
            count++;
            num /= 2;
        }
        System.out.println(binaryValue);
    }

    public static void main(String[] args) {
        System.out.println("Enter an Decimal value : ");
        Scanner sc = new Scanner(System.in);

        printBinary(sc.nextInt());
        sc.close();
    }
}
