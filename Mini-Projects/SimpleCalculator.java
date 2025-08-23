import java.util.*;
public class SimpleCalculator{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the a value");
    int a = sc.nextInt();
    System.out.println("And the b value  ");
    int b = sc.nextInt();
    System.out.println("Now Choose the operation from 1-5 \n 1 : + (Addition) a + b \n 2 : - (Subtraction) a - b\n 3 : * (Multiplication) a * b \n 4 : / (Division) a / b \n 5 : % (Modulo or remainder) a % b");
    int result = sc.nextInt();

    switch(result){
            case 1 :
            System.out.println("Result of the operation1 is "+ a +" + "+ b +" = "+(a+b));
            break;
            case 2 :
            System.out.println("Result of the operation2 is "+ a +" - "+ b +" = "+(a-b));
            break;
            case 3 :
            System.out.println("Result of the operation3 is "+ a +" * "+ b +" = "+(a*b));
            break;
            case 4: if(b == 0){
                        System.out.println("Invalid Division");
                    } else{
                        System.out.println("Result of the operation4 is "+ a +" / "+ b +" = "+(a/b));
                    }
            break;
            case 5 : if(b == 0){
                        System.out.println("Invalid Division");
                    } else{
                        System.out.println("Result of the operation5 is "+ a +" % "+ b +" = "+(a%b));
                    }
            break;
            default:
            System.out.println("Invalid operation");
        }
        sc.close();   
    }
}