package Core_Java_PartI_Fundamentals;
import static java.lang.Math.*;

public class Chapter3_FundamentalProgrammingStructuresInJava {
    // constants
    // in Java are declared with the `final` keyword
    // to make them available to multiple methods in a class, we can declare them as class constants
    // using the keyword `static`.
    // Following class demonstrates the use of class constants
    public class Constant2{
        public static final double CM_PER_INCH = 2.54;
        public static void main(String...args){
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.println("Paper dimensions in Inches: "+paperHeight*CM_PER_INCH+" X "+paperWidth*CM_PER_INCH);
        }
    }
    //Trying out enumerated types
    enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE};
    public static void main(String...args){
        Constant2.main(); // Paper dimensions in Inches: 27.94 X 21.59
        System.out.println(Size.EXTRA_LARGE); //EXTRA_LARGE
        Size s = Size.MEDIUM;
        System.out.println(s); //MEDIUM

        //Using `floorMod`, always use floorMod instead of % operator
        System.out.println(-11%2); //-1. this problem is solved by method `floorMod` of class Math
        System.out.println(floorMod(-11,2)); // 1
        System.out.println(-11/2); // -5
        System.out.println(floorMod(11,-2)); //-1, this is a problem encountered when using `floorMod`
        System.out.println(floorMod(5+(-14),12));//3

        //For precise and exact results across all platforms use StrictMath library instead of Math.
        //However, StrictMath library comes at the cost of performance as compared to Math library.
        System.out.println(StrictMath.floorMod(52+100,23));

        // When multiplication or any other arithmetic calculation exceeds the data-types limits use methods from
        //Math or StrictMath class
        System.out.println(1_000_000_000*3); // -1294967296
        //System.out.println(multiplyExact(1_000_000_000,3)); //this throws an exception

        //The int data type can be implicitly converted to float, but there is loss of precision
        int n = 123456789;
        float f = n;
        System.out.println("Integer: "+n+", Floating-point: "+f); //Integer: 123456789, Floating-point: 1.23456792E8

        float nx = 9.997f;
        int num = Math.round(nx);

        float nx_2 = 9.55f;
        int num_2 = Math.round(nx_2);

        float nx_3 = 9.43f;
        int num_3 = Math.round(nx_3);
        System.out.println("num: "+num+",num_2: "+num_2+",num_3: "+num_3); //num: 10,num_2: 10,num_3: 9

        int x = 4;
        x+=4.5;
        System.out.println(x); //8

        // In java assignment is an expression
        int y = x+=56; //x+=56 was evaluated and stored in y
        System.out.println(x); //64
        System.out.println(y); //64

        //Using switch statements with enumeration
        enum Size{SMALL,MEDIUM,LARGE,EXTRA_LARGE};
        Size itemSize_1 = Size.MEDIUM;
        System.out.println(itemSize_1);
        Size itemSize =Size.EXTRA_LARGE;
        String label = switch(itemSize){ //has itemSize been `null` even default wouldn't have stopped the coming NPE.
            case SMALL -> "S";
            case MEDIUM -> "M";
            case LARGE -> "L";
            case EXTRA_LARGE -> "XL";
            //default -> "OH NO";
        };
        System.out.printf("We got-> %s\n",label);




    }
}
