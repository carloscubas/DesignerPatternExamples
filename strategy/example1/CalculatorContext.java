package example1;

public class CalculatorContext {

    private IOperationStrategy strategy;

    public CalculatorContext(IOperationStrategy strategy){
        this.strategy = strategy;
    }

    public void compute(){
        this.strategy.compute();
    }
}