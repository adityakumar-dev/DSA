import java.util.Scanner;

public class PrimeRange {

    public static boolean IsPrime(int num) {
        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void PrintRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (IsPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an num : ");
        PrintRange(sc.nextInt());
        sc.close();
    }
}