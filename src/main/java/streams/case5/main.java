package streams.case5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        //Case 4 : Write a method that returns a comma-separated string based on a given list of integers.
        // Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. For example, if the input list is (3,44), the output should be 'o3,e44'.

        List<Integer> integers = Arrays.asList(3,44, 7, 20);

        System.out.println(integers.stream()
                .map(x -> x % 2 == 0 ? ("e" + x) : "o" + x)
                .collect(Collectors.joining(",")));

    }
}
