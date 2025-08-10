import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        //If- else statements

        if(age > 18){
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
        sc.close();
    }
}
