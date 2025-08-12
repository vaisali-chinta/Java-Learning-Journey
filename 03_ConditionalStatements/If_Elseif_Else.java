import java.util.*;
public class If_Elseif_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //If - else if - else statements
        if(a > b){
            System.out.println("a is greater than b ");
        } else if ( a <  b) {
            System.out.println("a is lesser than b ");
        } else {
            System.out.println("a is equal to b");
        }
        sc.close();
       


    }
}
