package Java_Threads_And_Concurrency_Utilities.Chapter1;
public class Runnable_Code1{
    public static void main(String...args){
        Runnable r=new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        
    }
}
