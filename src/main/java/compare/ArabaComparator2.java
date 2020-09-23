package compare;

import java.util.Comparator;

public class ArabaComparator2 implements Comparator<Araba2> {
    @Override
    public int compare(Araba2 o1, Araba2 o2) {
        int i =  Integer.compare(o1.motor, o2.motor);

        if(i!=0) return i;

        return o2.marka.compareTo(o1.marka);
    }
}
