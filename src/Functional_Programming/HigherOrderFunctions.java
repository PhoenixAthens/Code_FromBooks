package Functional_Programming;
public class HigherOrderFunctions {
    public interface BinaryOut{
        public abstract int comp(int a, int b);
    }
    //A higher order function is a function that takes another function as argument
    private static void apply(BinaryOut bi, int arg1, int arg2){
        System.out.println(bi.comp(arg1,arg2));
    }
    public void demo(){
        Runnable runner = ()->System.out.println("Hello, I ran!");
        runner.run();
        BinaryOut bi_1 = (arg1,arg2)->arg1*arg2;
        apply(bi_1,23,34);//782
        apply((arg1,arg2)->(int)Math.pow(arg1,3)*(int)Math.pow(arg2,4),22,43);//2043654680
    }
    public static void main(String...args){
        new HigherOrderFunctions().demo();
    }
}
