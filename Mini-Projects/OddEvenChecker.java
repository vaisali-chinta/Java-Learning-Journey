import java.util.*;
public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println(number+" is Even Number");
        } else{
            System.out.println(number+" is Odd Number");
        }
    }
}
