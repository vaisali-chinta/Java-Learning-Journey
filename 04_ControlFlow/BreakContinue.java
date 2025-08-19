public class BreakContinue {
    public static void main(String[] args) {
        
    //break Statement is used to jump out of a loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
               break;
            }
            System.out.println(i);
        }
        
    //continue statement breaks one iteration (in the loop).
        for(int i = 0; i < 10; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }
    
    }
}
