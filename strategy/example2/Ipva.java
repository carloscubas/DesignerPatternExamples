package example2;

public class Ipva implements Tax{

    @Override
    public double calculate(double value) {
        return value * 20;
    }
}
