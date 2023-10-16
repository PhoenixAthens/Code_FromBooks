package Functional_Programming_With_Java_BOOK;

public class Lesson1_Basics {
    //The following program in essence is functional in nature, even though it mutate states. This is because
    //in java, arguments are passed by value, so mutation within function does not affecting anything outside the function
    public static int add(int a, int b){
        while(b>0){
            a++;
            b--;
        }
        return a;
    }
    //Following is not a program that is functional is essence. This is because if b==0, we get an Exception.
    public static int div(int a, int b){
        return a/b;
    }
    //Following is functional in essence, in that if b == 0, we don't get an exception
    public static int div_2(int a, int b){
        return (int)(a/(float)b);
    }
    public static void main(String...args){
        System.out.println(add(100,200));//300
        System.out.println(div(12,6));//2
        System.out.println(div_2(12,0));//2147483647, well the result in not correct but we didn't get an exception
    }
}
