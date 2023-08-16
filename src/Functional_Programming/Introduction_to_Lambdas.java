package Functional_Programming;

public class Introduction_to_Lambdas {
    /**
     * DefineArithmetic is a functional interface that define an abstract method
     *
     * The purpose of this functional interface is to define a functional that takes to arguments
     * and performs some operation using those arguments.
     * */
    @FunctionalInterface
    public interface DefineArithmetic{
        /**
         * compute is an abstract method that takes two arguments
         *
         * This fucntion will be used later to demonstrate how its definition can be provided using
         * either anonymous classes or using lambda expressions.
         * */
        abstract public int compute(int x, int y);
    }
    public static void main(String...args){
        //OLD WAY
        DefineArithmetic exp = new DefineArithmetic() {
            @Override
            public int compute(int x, int y) {
                return (x+y)*(x-y)+((int)Math.pow(x,2))+(int)Math.pow(y,2)-2*x*y;
            }
        };

        //First way to define a lambda expression
        DefineArithmetic add = (int a, int b)->{return a+b;};
        //Second way to define a lambda, here the return keyword is implicit and curly braces are removed
        DefineArithmetic sub = (int a, int b)->(a-b);
        //Third way, we can even get rid of the parens
        DefineArithmetic mul = (int a, int b)->a*b;
        //Fourth way, the type of arguments is implicitly determined (by the compiler) using compute's signature
        DefineArithmetic div = (a,b)->a/b;

        //Here, we call .compute() on each object reference, because using lambdas we are basically defining the method
        //signature of the abstract method declared in the functional interface.
        System.out.println(add.compute(23,56));
        System.out.println(sub.compute(45,90));
        System.out.println(mul.compute(123,98));
        System.out.println(div.compute(45,177));
        //Before Java8 above, we used anonymous classes, which could be used similarly
        System.out.println(exp.compute(189,65));
    }
}
