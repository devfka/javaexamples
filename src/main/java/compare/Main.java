package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Araba araba1 = new Araba(5, "AA");
        Araba araba2 = new Araba(4, "AB");
        Araba araba3 = new Araba(3, "BA");
        Araba araba4 = new Araba(2, "CC");
        Araba araba5 = new Araba(1, "CD");
        Araba araba6 = new Araba(5, "GG");
        Araba araba7 = new Araba(4, "JJ");
        Araba araba8 = new Araba(3, "KK");
        Araba araba9 = new Araba(2, "LL");
        Araba araba10 = new Araba(1, "PP");

        List<Araba> arabaList = new ArrayList<Araba>();
        arabaList.add(araba1);
        arabaList.add(araba2);
        arabaList.add(araba3);
        arabaList.add(araba4);
        arabaList.add(araba5);
        arabaList.add(araba6);
        arabaList.add(araba7);
        arabaList.add(araba8);
        arabaList.add(araba9);
        arabaList.add(araba10);

        Collections.sort(arabaList);

        arabaList.forEach( x-> {
            System.out.println(x.getMotor() + " " +x.getMarka());
        });
    }
}
