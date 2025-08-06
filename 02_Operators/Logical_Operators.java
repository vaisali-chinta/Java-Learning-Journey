public class Logical_Operators {
    public static void main(String[] args) {
        //Logical operators are used to determine the logic between variables or value

        int x = 5;

        System.out.println("(&&)Logical and returns true if both statements are true :"+(x < 7 && x < 12));
        System.out.println("(||)Logical or returns true if one of the statements is true :"+(x < 7 || x < 4));
        System.out.println("(!)Logical not reverses the result, returns false if the result is true :"+!(x < 5 && x < 10));
        
        
    }
}
