import java.util.Scanner;

//program to print the ragne of prime numbers
public class PrimeRange {
    // function for check num is prime or not
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
    // function for print the prime numbers

    public static void PrintRange(int num) {

        for (int i = 2; i <= num; i++) {
            if (IsPrime(i)) { // calling is prime to check number is prime
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