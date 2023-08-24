package Functional_Programming;
import java.lang.invoke.LambdaMetafactory;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
public class UsingLambdas_withComparator {
    public static Comparator<Integer> comC = new Comparator<Integer>(){
        @Override
        public int compare(Integer n1,Integer n2){
            return n2-n1; //Descending order
            //had we returned n1-n2, then if n2>n1, we get a -ve value, which means n1 should precede n2
        }
    };
    public static Comparator<Integer> comC_2 = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2; //Ascending order
        }
    };
    public static void main(String...args){
        new UsingLambdas_withComparator().arraySorter();
    }
    public void arraySorter(){
        //old way
        Integer[] array1 = new Integer[50];
        Integer[] copy_1 = new Integer[50];
        populate(array1);
        System.arraycopy(array1,0,copy_1,0,copy_1.length);
        System.out.println("Unsorted: "+Arrays.toString(array1));
        Arrays.sort(array1,comC);
        System.out.println("Sorted (Descending): "+Arrays.toString(array1));
        Arrays.sort(copy_1,comC_2);
        System.out.println("Sorted (Ascending): "+Arrays.toString(copy_1));

        Integer[] array2 = new Integer[50];
        Integer[] copy_2 = new Integer[50];
        populate(array2);
        System.arraycopy(array2,0,copy_2,0,copy_2.length);
        System.out.println("Unsorted: "+Arrays.toString(array2));
        Arrays.sort(array2,(n1,n2)->n2-n1);
        System.out.println("Sorted (Descending): "+Arrays.toString(copy_2));
        Arrays.sort(copy_2,(n1,n2)->n1-n2);
        System.out.println("Sorted (Ascending): "+Arrays.toString(copy_2));
    }
    public void populate(Integer[] po){
        Random r = new Random();
        for(int i=0;i<po.length;i++){
            po[i]=r.nextInt(1000);
        }
    }
}
