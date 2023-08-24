package Functional_Programming;

public class DefaultMethods {
    @FunctionalInterface
    public interface funcInt{
        abstract public int compute(int a, int b);
        //default methods are much closer to instance methods and can be called on objects
        default void printHello(int a,int b){
            System.out.println(compute(a,b));
        }
        // We can use 'this' default methods but not in static methods.
        default void helloFromClass(){
            System.out.println("Hello, I am "+ this.getClass().toString());
        }
        static void helloWorld(){
            System.out.println("Hello World!!");
        }
    }
    public void demo(){
        //Addition implementation into compute()
        funcInt.helloWorld();
        funcInt add = (arg1,arg2)->arg1+arg2;
        add.helloFromClass();
        add.printHello(23,34);

        funcInt mult = (arg1,arg2)->arg1*arg2;

        funcInt compose = (arg1,arg2)->mult.compute(add.compute(arg1,arg2)*mult.compute(arg2,arg2),arg2-arg1);
        int composeResult = compose.compute(123,432);
        System.out.println("Result: "+composeResult);
    }
    public static void main(String...args){
        new DefaultMethods().demo();
    }
}
