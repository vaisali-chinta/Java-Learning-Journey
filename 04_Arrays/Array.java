import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Type - 1
        int marks[] = new int[3];
        marks[0] = 95;//phy
        marks[1] = 98;//chem
        marks[2] = 99;//maths
       System.out.println(marks[0]);
       System.out.println(marks[1]);
       System.out.println(marks[2]);

                //(or)

       for(int i = 0; i < 3;/*size*/ i++){
        System.out.println(marks[i]);
    }

       //Type - 2
        int numbers[] = {10,20,30,40,50};

        for(int i = 0; i < numbers.length;/*length of array*/ i++){
        System.out.println(numbers[i]);
    }

        //Type - 3
        int size = sc.nextInt();
        int number[] = new int[size];

        //Taking Input
        for(int i = 0;i < size;i++){
            number[i]= sc.nextInt();
        }

        //printing output
        for(int i = 0; i < size;i++){
            System.out.println(number[i]);
        }
        sc.close();
    }
}
