package compare;

public class Araba implements Comparable<Araba> {

    int motor;
    String marka;

    public Araba(int motor, String marka) {
        this.motor = motor;
        this.marka = marka;
    }


    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public int compareTo(Araba o) {
        int i =  Integer.compare(this.motor, o.motor);

        if(i!=0) return i;

        return this.marka.compareTo(o.marka);
    }
}
