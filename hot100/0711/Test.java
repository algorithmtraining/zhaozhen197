import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;


public class Test {


public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("dddddddddd");
    list.add("abcedde");
    list.add("rueirei");

    list.stream().filter((s)->s.startsWith("r")).forEach(System.out::println);
    list.stream().map(String::toUpperCase).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
    Optional<String> reduced = list.stream().sorted().reduce((s1,s2)->s1 + "#" +  s2);
    reduced.ifPresent(System.out::println);

    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(1, -1);

}

    
}