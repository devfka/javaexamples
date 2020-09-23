package equalsAndHashcode;

public class Kerem {

    int a;
    String b;

    public Kerem(int a, String b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public boolean equals(Object o) {
        Kerem kerem = (Kerem) o;
        return a == kerem.a &&
                b.equals(kerem.b);
    }

    @Override
    public int hashCode() {
        return a * 3 + b.length();
    }
}
