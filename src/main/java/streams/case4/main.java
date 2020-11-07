package streams.case4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        //Case 4 : Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.

        List<String> strings = Arrays.asList(
                "aaa","Aaa", "abb", "bbb", "baA", "aty", "asdasda"
        );

        System.out.println(strings.stream()
                .filter(x -> x.startsWith("a"))
                .filter(x-> x.length() == 3)
                .collect(Collectors.toList()));



    }
}
