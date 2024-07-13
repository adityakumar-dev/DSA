import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDecimal(num);
        sc.close();

    }

    public static void printDecimal2(int num) {

    }

    public static void printDecimal(int num) {
        int length = String.valueOf(num).length(), decimalValue = 0;
        for (int i = 0; i < length; i++) {
            int tempValue = Integer.parseInt(String.valueOf(num).charAt(length - 1 - i) + "");
            decimalValue += tempValue * (int) Math.pow(2, i);
        }
        System.out.println(decimalValue);

    }
}
