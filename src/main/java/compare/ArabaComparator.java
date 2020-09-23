package compare;

import java.util.Comparator;

public class ArabaComparator implements Comparator<Araba2> {
    @Override
    public int compare(Araba2 o1, Araba2 o2) {
        int i =  Integer.compare(o1.motor, o2.motor);

        if(i!=0) return i;

        return o1.marka.compareTo(o2.marka);
    }
}
