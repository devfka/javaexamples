package generics;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        //generic method
        //generic class

        String plakaString = "kerem";
        Integer plakaInteger = new Integer(1);


        GenericClass<String> kerem = new GenericClass<>();
        GenericClass<Long> fatih = new GenericClass<>();
        List<String> strings = new ArrayList<>();


    }

    <T> void genericMethod(T myObject, List<T> myList) {

        if (myObject != null && myList.size() > 0) {
            if (myList.contains(myObject)) {
                myList.forEach(System.out::println);
            }
        }
    }
}

class GenericClass<T> {

    T plaka;

    public T getT() {
        return this.plaka;
    }

    public void setT(T myObject) {
        this.plaka = myObject;
    }

}
