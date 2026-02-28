package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S07_SortListOfStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("num", "apple", "py", "banana", "orange", "grape");

        List<String> collect = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);

        strings.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}
