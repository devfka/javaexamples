package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        Araba2 araba1 = new Araba2(5, "AA");
        Araba2 araba2 = new Araba2(4, "AB");
        Araba2 araba3 = new Araba2(3, "BA");
        Araba2 araba4 = new Araba2(2, "CC");
        Araba2 araba10 = new Araba2(1, "PP");
        Araba2 araba5 = new Araba2(1, "CD");
        Araba2 araba6 = new Araba2(5, "GG");
        Araba2 araba7 = new Araba2(4, "JJ");
        Araba2 araba8 = new Araba2(3, "KK");
        Araba2 araba9 = new Araba2(2, "LL");


        List<Araba2> arabaList = new ArrayList<Araba2>();
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

        arabaList.sort(Comparator.comparing(Araba2::getMotor).thenComparing(Araba2::getMarka));

        arabaList.forEach( x-> {
            System.out.println(x.getMotor() + " " +x.getMarka());
        });

        arabaList.sort(Comparator.comparing(Araba2::getMotor).thenComparing(Araba2::getMarka).reversed());

        arabaList.forEach( x-> {
            System.out.println(x.getMotor() + " " +x.getMarka());
        });

        arabaList.sort(Comparator.comparing(Araba2::getMotor).thenComparing(Araba2::getMarka));

        arabaList.forEach( x-> {
            System.out.println(x.getMotor() + " " +x.getMarka());
        });

        arabaList.sort(Comparator.comparing(Araba2::getMotor).thenComparing(Araba2::getMarka, Comparator.reverseOrder()));

        arabaList.forEach( x-> {
            System.out.println(x.getMotor() + " " +x.getMarka());
        });

    }
}
