package Functional_Programming;
import java.util.OptionalDouble;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;

public class StreamOF {
    public static void main(String...args){
        StreamOF.demo();
    }
    public static void demo(){
        Stream.of("Ron","Harry","Hagrid","Chandler","Joey","Lissy","Leila","benji","Maurice","Frenchie")
                .filter(x->x.chars().sum()>400)
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
        IntStream
                .range(1,250)
                .filter(x->(x & 0x1)>0)
                .map(x->x*3)
                .forEach(System.out::println);
        List<String> odds =
                IntStream.range(1,250)
                        .filter(x->(x & 0x1)>0)
                        .mapToObj(x->x+" ")
                        .collect(Collectors.toList()); //.collect(Collectors.toList()), can entirely be replaced by .toList()
        odds.forEach(System.out::print);
        //odds.stream.forEach(System.out.println); //These are two different forEach method implementations
        System.out.println();
        OptionalDouble avgOfEvens =
                IntStream.range(1,250)
                        .filter(x->(x&0x1)==0)
                        .average();
        double realAvg = avgOfEvens.isPresent()?avgOfEvens.getAsDouble():-1;
        System.out.println("AVG: "+realAvg);

        int sum =
                IntStream.range(1,250)
                        .filter(x->(x&0x1)>0)
                        .sum();
        System.out.println("SUM: "+sum);

    }
}
