package Core_Java_PartI_Fundamentals;

public class Beyond_16Bit_Unicode {
    public static void main(String...args){
        //To represent characters beyond standard 16-bit
        //Say the mathematical symbol 𝕆, which has the hex-value U+1D546
        System.out.println("\uD835\uDD46");
        //What we have done is use two code units where first code unit lie btw
        //U+D800 to U+DBFF for the first code unit, U+DC00 to U+DFFF for the second code unit
        //Basically using the surrogate area
    }
}
