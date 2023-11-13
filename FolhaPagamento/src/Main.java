import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Employee employee = new Employee(160.0, 225.20, 3 );

        List<Tax> taxesCLT = Arrays.asList(new InssTax(), new IncomeTax());
        List<Tax> taxesPJ = Arrays.asList(new IncomeTax());

        PayrollCalculation payrollCalculation = new PayrollCalculation(taxesCLT, employee);
        System.out.println(payrollCalculation.getCalculator());
    }
}
