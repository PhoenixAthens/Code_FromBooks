package Core_Java_PartI_Fundamentals;
import java.util.Scanner;
public class TestingBinaryNumbers {
    public static void main(String...args){
        // Thus you can't use this trick to convert numbers from Binary to Decimal
        int num;
        byte n = -1;//255 on using the method below!
        System.out.println(Byte.toUnsignedInt(n));
        Scanner scan=new Scanner(System.in);
        String numberInBinary = scan.nextLine();
        String comNumber="0b"+numberInBinary;
        num=Integer.parseInt(comNumber);
        System.out.println(num);

    }
}
