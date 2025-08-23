import java.util.*;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        //OddEven
        if(number % 2 == 0){
            System.out.println(number+" is Even Number");
        } else {
            System.out.println(number+" is Odd Number");
        } 

        //Prime
        if(number <=1){
            System.out.println(number+" is neither prime nor Composite Number");
        } else {
            boolean isPrime = true;
            for(int i = 2 ; i <= Math.sqrt(number);i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number+" is Prime Number");
            } 
        }
        sc.close();
    } 
}
