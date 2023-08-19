package Functional_Programming;

public class Lesson1_Challenge {
    public interface func{
        abstract int apply(int a, int b);
        //abstract int apply2(int a);
        default void printer(){
            System.out.println("Hello, I am a default method!!");
        }
        default void ri(){
            System.out.println("Helli");
        }
    }
    public void demo(){
        func add = (int arg1, int arg2)->{ return arg1+arg2;};
        func mult = (arg1,arg2)->arg1*arg2;
        System.out.println(add.apply(mult.apply(23,45),mult.apply(22,989))); //22793
    }
    public static void main(String...args){
        new Lesson1_Challenge().demo();
    }
}
