package streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    //Case 8: re-write transform method using lambda

    public static void main(String[] args) {

            List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
            List<String> expected = Arrays.asList("Viktor", "Farcic", "John", "Doe", "Third");

        System.out.println(transform(collection).equals(flatMapTransform(collection)));
    }

    public static List<String> flatMapTransform(List<List<String>> collection)
    {
        return collection.stream().flatMap(strings -> strings.stream()).collect(Collectors.toList());
    }

    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }
}
