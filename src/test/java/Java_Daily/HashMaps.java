package Java_Daily;

import org.assertj.core.api.ListAssert;
import org.assertj.core.util.*;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
/**
 * Code from Article: Get values and keys as ArrayList From a HashMap
 * Source: <a href="https://www.baeldung.com/java-values-keys-arraylists-hashmap">...</a>
 *
 * */
public class HashMaps {

    static final HashMap<String, String> Dev_Map;
    private String name;

    /**
     * In Java, a static block, also known as a static initialization block or static clause,
     * is used for the static initialization of a class. The code inside the static block
     * is executed only once, the first time the class is loaded into memory. Static blocks
     * can be used to initialize static variables, set up resources, or perform any other tasks
     * that need to be done before the class is used.
     * */
    static{
        // name = "Hello"; This can't be initialised here!
        Dev_Map = new HashMap<>();
        Dev_Map.put("Jim","Fedora linux");
        Dev_Map.put("Kaéla","MacOSX");
        Dev_Map.put("landon","Windows");
        Dev_Map.put("Phoenix","MaxOSX");
        Dev_Map.put("Uriel","Linux Mint");
        Dev_Map.put("Geoffrey","Debian");
    }
    public static void main(String...args){
        System.out.println(Dev_Map);
        List<String> mapKeys = new ArrayList<>(Dev_Map.keySet());
        ListAssert<String> make = assertThat(mapKeys).containsExactlyInAnyOrder("Kaéla","landon","Phoenix","Uriel","Geoffrey","Jim");
        //The thing about `assertThat in above statement is that if both lists don't match you get this:
        /*
        Exception in thread "main" java.lang.AssertionError:
            Expecting:
            <["Uriel", "Geoffrey", "Kaéla", "Phoenix", "Jim", "landon"]>
            to contain exactly in any order:
             <["Kaéla", "landon", "Phoenix", "Uriel", "Geoffrey"]>
            but the following elements were unexpected:
            <["Jim"]>
            at Java_Daily.HashMaps.main(HashMaps.java:34)
        * */
        System.out.println(Lists.newArrayList("Mike","James","olga","unik","pont","rena","lukas"));
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"hello","Hallo","Hola","Moshi moshi","Namaste");
        System.out.println(list);

        //Start from 4. Getting Correlated Key and Values Lists

    }

}
