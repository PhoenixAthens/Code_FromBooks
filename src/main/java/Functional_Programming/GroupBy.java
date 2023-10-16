package Functional_Programming;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;
class Num{
    enum Parity{
        ODD,EVEN
    }
    private int value;
    Num(int n){
        this.value = n;
    }
    public int getValue(){return this.value;}
    public void setValue(int n){this.value=n;}
    public void setRandom(){
        this.value = new Random().nextInt(100);
    }
    public Parity getParity(){
        return ((value & 0x1)>0)?Parity.ODD:Parity.EVEN;
    }
    public void dump(){
        System.out.format("Value: %2d (parity: %s)\n",getValue(),getParity());
    }
}
public class GroupBy {
    private static final int howMany = 64;
    public void demo(){
        Random r = new Random();
        Num[] arr = new Num[howMany];
        //Below is us filling the array with ints
        /** for the stream below to work, we need
         * int[] arr = new int[howMany];
         *
         * arr = Arrays.stream(arr).map(x->x=r.nextInt(100)).toArray();  // This does, instead of using for-loop
         * arr = Stream.of(arr).mapToInt(x->x=r.nextInt(100)).toArray(); //This doesn't work
         * */

        //The instructor filled the array with Num objects
        arr = Arrays.stream(arr).map(x->new Num(r.nextInt(100))).toArray(Num[]::new);
        //Check notes to see how above works, you can also replace "Num[]::new" with "x->new Num[howMany]"


        int sumArr = Arrays.stream(arr).mapToInt(Num::getValue).sum();
        //The instructor used the following procedure
        List<Num> arrToList = Arrays.asList(arr);
        int sumArr_traditional =
                arrToList
                        .stream()
                        .mapToInt(Num::getValue)
                        .sum();
        System.out.printf("Sum of random elem array-> (myWAY):%d, (tradWay):%d\n",sumArr,sumArr_traditional);

        int sumArr_OtherWay = Arrays.stream(arr).mapToInt(Num::getValue).reduce(0,(sof,aft)->sof+aft);
        //(sof+aft)->sof+aft can be replaced with Integer::sum
        int sumArr_OtherWay_Traditional = arrToList.stream().mapToInt(Num::getValue).reduce(0,Integer::sum);
        System.out.printf("Sum again: (myWay):%d, (traditional):%d\n",sumArr_OtherWay,sumArr_OtherWay_Traditional);

        Map<Num.Parity,List<Num>> mapOfElems_fromList =
                arrToList.stream().collect(Collectors.groupingBy(Num::getParity));
        Map<Num.Parity,List<Num>> mapOfElems_fromArr =
                Arrays.stream(arr).collect(Collectors.groupingBy(Num::getParity));

        List<Num> evens = mapOfElems_fromArr.get(Num.Parity.EVEN);
        List<Num> odds = mapOfElems_fromArr.get(Num.Parity.ODD);
        dumpList("Evens",evens);
        System.out.println("=".repeat(100));
        dumpList("Odds",odds);



    }
    public void dumpList(String msg, List<Num> list){
        System.out.println(msg+": ");
        list.forEach(Num::dump);
    }
    public static void main(String...args){
        new GroupBy().demo();
    }

}
