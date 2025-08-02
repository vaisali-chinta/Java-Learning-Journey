import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        //To Take Input from User
        
        int intVal = sc.nextInt();//Integer values
        String name = sc.next();//string 
        String name_1 = sc.nextLine();// full string
        byte byteVal = sc.nextByte();//byte values
        short shortVal = sc.nextShort();//short values
        float floatVal = sc.nextFloat();//float values
        double doubleVal = sc.nextDouble();//double values
        boolean boolVal = sc.nextBoolean();//true or false
        long number = sc.nextLong();//long values

        //To display Output to the user
        System.out.println(intVal);
        System.out.println(name);
        System.out.println(name_1);
        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(boolVal);
        System.out.println(number);
        
        sc.close();
    }
}


