package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S05_ConvertListOfStringsToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        List<String> collect = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
