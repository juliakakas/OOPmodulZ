package Zoo;

public class Eagle extends Bird implements Oviparous, Flyable{
    @Override
    public void makeNoise() {

    }

    @Override
    public int eggNumber() {
        return 0;
    }

    @Override
    public int flightSpeed() {
        return 0;
    }
}
