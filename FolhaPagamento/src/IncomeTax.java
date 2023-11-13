public class IncomeTax implements Tax{

    @Override
    public double calculate(Employee employee) {

        double baseSalary = employee.baseSalary();

        if(baseSalary <= 500.0){
            return 0.0;
        } else if (baseSalary > 500 && baseSalary <= 1000) {
            return (baseSalary * 5)/100;
        }else{
            return (baseSalary * 7)/100;
        }

    }
}
