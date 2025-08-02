public class Variables {
     public static void main(String[] args) {

        //Rules to name a variable
        System.out.println("1. Must begin with letters (A-Z or a-z) and Underscore(_) and Cannot start with a digit(0-9)");
        System.out.println("2. Can contain letters(A-Z,a-z) and digits(0-9) and Underscore(_) and no spaces or characters(ie.,@,!..)");
        System.out.println("3. Cannot use Reserves Keywords(ie.,int,class,for,if,...)");
        System.out.println("4. Case sensitive(ie.,age and Age are different variables)");
        System.out.println("5. Naming Convetions should be either in CamelCase(sumOfNumbers) or snake_case(sum_of_numbers)");

        // Declaring a variable
        int myNum; 

        // Intialization of a variable
        myNum = 21; 
        System.out.println(myNum);

        // Declaring and Intializing the variable
        int number_Of_digits= 21;
        
        //Assigning a new value to existing variable,it will overwite the previous value
        number_Of_digits = 25;
        System.out.println(number_Of_digits);// Now number_of_digits is 25

        // final keyword is used when the value is unchangeable and read-only
        final float pi = 3.14f;
        System.out.println(pi);
        
    

    }
}
