package streams;

import java.util.List;

public class S06_CalculateAvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        integers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .ifPresent(System.out::println);
    }
}
