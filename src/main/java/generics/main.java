package generics;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        String plakaString = "kerem";
        Integer plakaInteger = new Integer(1);


        GenericClass<String> kerem = new GenericClass<>();
        GenericClass<Long> fatih = new GenericClass<>();
        List<String> strings = new ArrayList<>();

        MyHashTable<String, Integer> myHashTable = new MyHashTable<>();

        myHashTable.put("fatih", 123);
        myHashTable.put("ezgi", 456);
        myHashTable.put("onur", 789);

        System.out.println(myHashTable.get("fatih"));

    }

    <T> void genericMethod(T myObject, List<T> myList) {

        if (myObject != null && myList.size() > 0) {
            if (myList.contains(myObject)) {
                myList.forEach(System.out::println);
            }
        }
    }
}

