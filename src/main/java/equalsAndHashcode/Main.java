package equalsAndHashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Kerem kerem1 = new Kerem(1,"first");
        Kerem kerem2 = new Kerem(1,"first");

        Fatih fatih1 = new Fatih(2,"second");
        Fatih fatih2 = new Fatih(2,"second");

        boolean flag1 = kerem1.equals(kerem2); //true
        boolean flag2 = kerem1 == kerem2; //false

        boolean flag3 = fatih1.equals(fatih2); //false
        boolean flag4 = fatih1 == fatih2; //false

        System.out.println("flag 1: " + flag1);
        System.out.println("flag 2: " + flag2);

        System.out.println("HashCode Fatih : "+ fatih1.hashCode() +"  "+ fatih2.hashCode());
        System.out.println("HashCode Kerem : "+ kerem1.hashCode() +"  "+ kerem2.hashCode());

        Set<Object> hashSet = new HashSet();
        hashSet.add(kerem1);
        hashSet.add(kerem2);
        hashSet.add(fatih1);
        hashSet.add(fatih2);

        hashSet.forEach( x-> {
            System.out.println(x);
        });

    }


}
