package Functional_Programming;
import java.util.Random;
import java.util.Arrays;
public class Method_Constructor_references {
    public static class Num {
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int newValue) {
            this.value = newValue;
        }

        public boolean isODD() {
            return (this.value & 0x1) > 0;
        }

        public void dump() {
            System.out.printf("Value : %2d (Parity: %s)\n", getValue(), (isODD() ? "odd" : "even"));
        }
    }

    @FunctionalInterface
    public interface NumsMaker{
        abstract Num[] makeNums(final int n);
    }
    @FunctionalInterface
    public interface NumsFiller{
        abstract void populate(Num[] nums, int n);
    }
    public static class exampleHERE{
        public final int howMany = 30;
        public static void main(String...args){
            new exampleHERE().demo();
        }
        public void demo(){
            NumsMaker maker = Num[]::new;
            Num[] array = maker.makeNums(howMany);

            NumsFiller filledArray = (arr, n)->{
                Random ran = new Random();
                for(int i=0;i<array.length;i++){
                    array[i]=new Num();
                    array[i].setValue(ran.nextInt(100));
                }
            };
            filledArray.populate(array, array.length);
            Arrays.stream(array).filter(Num::isODD).forEach(Num::dump);
        }
    }
}
