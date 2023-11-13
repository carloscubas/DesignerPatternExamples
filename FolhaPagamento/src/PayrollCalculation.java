import java.util.List;

public class PayrollCalculation {

    private final List<Tax> taxs;

    private final Employee employee;

    public PayrollCalculation(List<Tax> taxs, Employee employee){
        this.taxs = taxs;
        this.employee = employee;
    }

    public double getCalculator(){

        double baseSalary = employee.baseSalary();

        for (Tax tax: taxs){
            baseSalary -= tax.calculate(this.employee);
        }

        return baseSalary;
    }

}
