package streams.case2;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        //Case 2 :Print out the sum of ages of all female authors younger than 25.
        List<Author2> authors2 = new ArrayList<>();

        authors2.add(new Author2("F", 24));
        authors2.add(new Author2("M", 24));
        authors2.add(new Author2("F", 26));
        authors2.add(new Author2("M", 24));
        authors2.add(new Author2("F", 23));
        authors2.add(new Author2("M", 24));
        authors2.add(new Author2("F", 22));
        authors2.add(new Author2("M", 24));
        authors2.add(new Author2("F", 21));
        authors2.add(new Author2("F", 26));

        System.out.println(authors2.stream()
                            .filter(x -> x.getAge() < 25)
                            .filter(x-> x.getSex().equals("F"))
                            .map(Author2::getAge)
                            .reduce(0, Integer::sum));



    }
}
