package Java_Threads_And_Concurrency_Utilities.Chapter1;

import java.util.Arrays;

public class Runnable_Code1{
    public static void main(String...args){
        //Day 1, Hours=1

        // This is how a Runnable instance was created before Java*
        //i.e., by creating an anonymous class that implements Runnable interface
        //and provides implementation for its method run()
        Runnable r1=new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        Thread t1=new Thread(r1);
        //To start a thread you use .start() method
        t1.start();
        System.out.println(Arrays.toString(t1.getStackTrace()));
        //Since java8, we can use lambda expressions to create runnable interface instances
        //This is possible because Runnable interface is a SAM, it has a single abstract method
        Runnable r2=()->System.out.println("Hello World from Java8");
        //trying out what this method does
        r2.run(); //executes the run() method
        Thread t2=new Thread(r2);
        //trying our what this method does
        t2.run(); //executes the run() method
        t2.start();

        //Why did the .getStackTrace() method return an empty array?
        //Will look into it next time!

        //End of day1
    }
}
