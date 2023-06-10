package Core_Java_PartI_Fundamentals;
import java.util.Formatter;
public class FloatingPoint_In_Hexadecimal {
    public static void main(String...args){
        Formatter f=new Formatter();
        System.out.println(f.format("%a",0.125)); //%a represents Hexadecimal
        //When an uppercase specifier is used, then letters are shown in uppercase.
        f.close();
        f=new Formatter(); //ln 8, 9 prevent buffer from being outputted in the next line.
        System.out.println(f.format("%S","hello world! Phoenix here!"));
        //This outputs: HELLO WORLD! PHOENIX HERE!
        Double dog=0.0;
        System.out.println(dog.equals(Double.NaN));//false;
        System.out.println(0.0==Double.NaN); //false

    }
}
