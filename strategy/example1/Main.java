package example1;

public class Main {

    public static void main(String[] args) {

        CalculatorContext ctx = new CalculatorContext(new PlusOperationStrategy(2, 3));
        ctx.compute();

        ctx = new CalculatorContext(new MinusOperationStrategy(2, 3));
        ctx.compute();

    }
}