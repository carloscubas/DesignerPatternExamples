package example2;

public class Iptu implements Tax{

    @Override
    public double calculate(double value) {
        return value * 10;
    }
}
