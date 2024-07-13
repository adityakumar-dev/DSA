import java.util.Scanner;

//program for convert decimal value to integer
public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter an Decimal Value : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // two option for convert decimal to integer

        // printDecimal(num);
        printDecimal2(num);
        sc.close();

    }

    // first solution
    public static void printDecimal2(int num) {
        int pow = 0;
        int decimalValue = 0;
        while (num > 0) {
            int temp = num % 10;
            decimalValue += temp * (int) Math.pow(2, pow);
            pow++;
            num /= 10;
        }
        System.out.println(decimalValue);
    }

    // second solution
    public static void printDecimal(int num) {
        int length = String.valueOf(num).length(), decimalValue = 0;
        for (int i = 0; i < length; i++) {
            int tempValue = Integer.parseInt(String.valueOf(num).charAt(length - 1 - i) + "");
            decimalValue += tempValue * (int) Math.pow(2, i);
        }
        System.out.println(decimalValue);

    }
}
