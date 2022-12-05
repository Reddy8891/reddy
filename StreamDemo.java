

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String... args){
        List<String> strings= Arrays.asList("shiva", "reddy", "sai", "reddy");
        Stream<String> stringStream=strings.stream();
        stringStream.filter(x->x.startsWith("s")).map(p->p+"moris").sorted().forEach(n->System.out.println(n));


    }
}
    //create a Stream of String Collection and filter all the names that start with 'S'
// and then append 'Moris' to all those names and then display