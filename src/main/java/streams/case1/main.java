package streams.case1;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class main {

    public static void main(String[] args) {

        //Case 1 :Get the unique surnames in uppercase of the first 15 book authors that are 50 years old or older
        List<Author> authors = new ArrayList<>();

        authors.add(new Author("fka", 51));
        authors.add(new Author("aaa", 51));
        authors.add(new Author("bbb", 51));
        authors.add(new Author("ccc", 49));
        authors.add(new Author("ccc", 51));
        authors.add(new Author("ddd", 51));
        authors.add(new Author("eee", 49));
        authors.add(new Author("fff", 51));
        authors.add(new Author("ggg", 51));
        authors.add(new Author("ggg", 51));
        authors.add(new Author("yyy", 51));
        authors.add(new Author("zzz", 49));
        authors.add(new Author("zzz", 51));
        authors.add(new Author("iii", 51));
        authors.add(new Author("iii", 51));
        authors.add(new Author("qwwe", 51));
        authors.add(new Author("qqq", 51));
        authors.add(new Author("qqq", 51));
        authors.add(new Author("mmm", 49));
        authors.add(new Author("nnn", 51));
        authors.add(new Author("vbn", 51));
        authors.add(new Author("axg", 49));
        authors.add(new Author("kui", 51));
        authors.add(new Author("fjn", 49));
        authors.add(new Author("zgn", 51));

        List<String> authorListFiltered = authors.stream()
                .filter(x-> x.getAge() > 50)
                .map(x-> x.getSurname().toUpperCase())
                .distinct()
                .limit(15)
                .sorted()
                .collect(toList());

        authorListFiltered.forEach( x-> {
            System.out.println(x);
        });





    }
}
