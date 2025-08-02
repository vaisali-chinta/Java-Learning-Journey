public class TypeCasting {
    public static void main(String[] args) {
        
        //Type casting : When you assign a value of one datatype to another

        //1.Widening casting(Automatically) : Converting smaller into larger type size
        // ie., byte->short->char->int->long->float->double 
        int myNum = 8;
        double myDouble = myNum;

        System.out.println(myNum);//8
        System.out.println(myDouble);//8.0

        
        //2.Narrowing casting(Manually) : Converting a larger to smaller type size(data loss)
        //ie., double->float->long->int->char->short->byte
        double my_Double = 9.78d;
        int my_Num = (int)my_Double;

        System.out.println(my_Double);//9.78
        System.out.println(my_Num);//9





    }
}
