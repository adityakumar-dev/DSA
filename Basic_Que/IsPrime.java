import java.util.Scanner;

//program to check number is prime or not 
public class IsPrime {

    // function for check prime
    public static boolean check_prime(int num) {
        if (num <= 2) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {

                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        // scanner class for take input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(check_prime(num));
    }
}