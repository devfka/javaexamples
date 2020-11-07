package streams.case3;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        //Case 3 :Write a method that returns the average of a list of integers..

        List<Integer> integers = Arrays.asList(1,3,4,5,6,7,8,9,1,2,3,5,6,7,2,3,4,1,22,44,6,77,7,77);

        System.out.println(integers.stream()
                                .mapToInt(Integer::intValue)
                                .average().getAsDouble());

    }
}
