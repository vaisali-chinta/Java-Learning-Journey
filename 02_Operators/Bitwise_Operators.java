public class Bitwise_Operators {
    public static void main(String[] args) {
        //Bitwise operators are used to perform operations on individual bits of integer values

        int a = 5;  // 0101 
        int b = 3;  // 0011 

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a & b (AND): " + (a & b));  // 0101 & 0011 = 0001 -> 1
        System.out.println("a | b (OR): " + (a | b));   // 0101 | 0011 = 0111 -> 7
        System.out.println("a ^ b (XOR): " + (a ^ b));  // 0101 ^ 0011 = 0110 -> 6
        System.out.println("~a (NOT): " + (~a));        // ~0101 = 1010 (in 2's complement = -6)

        System.out.println("a << 1 (Left Shift): " + (a << 1));  // 0101 << 1 = 1010 -> 10
        System.out.println("a >> 1 (Right Shift): " + (a >> 1)); // 0101 >> 1 = 0010 -> 2
    }

}
