package streams;

import java.util.Arrays;
import java.util.List;

public class S04_CountTheNumberOfStringsContainingSpecificCharacter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        char searchChar = 'a';

        long count = strings.stream()
                .filter(s -> s.contains(String.valueOf(searchChar)))
                .count();
        System.out.println(count);
    }
}
