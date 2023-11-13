package example2;

public class Inss implements Tax{
    @Override
    public double calculate(double value) {
        return value * 5;
    }
}
