import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //For Loop

        for(int count = 0 ; count <= number; count++ ){
            System.out.print(count+" ");
        }
        sc.close();
    }
}
