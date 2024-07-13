import java.util.Scanner;
public class IsPrime{
    public static boolean check_prime(int num){
        if(num <= 2){
            return true;
        }else {
            for(int i = 2 ; i< Math.sqrt(num); i++){
                
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
            System.out.println("Enter the number : ") ;

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.close();
            System.out.println(check_prime(num)) ;
    }
}