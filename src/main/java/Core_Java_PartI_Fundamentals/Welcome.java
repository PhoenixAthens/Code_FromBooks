package Core_Java_PartI_Fundamentals;

public class Welcome {
    public static void main(String...args){
        var greetings = "Hello, java";
        System.out.println(greetings);
        var len=greetings.length();
        for(int i=0;i<len;i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
