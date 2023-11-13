public class InssTax implements Tax{
    @Override
    public double calculate(Employee employee) {
        double baseSalary = employee.baseSalary();

        if(baseSalary <= 1000){
            return (baseSalary * 8.5)/100;
        }else{
            return (baseSalary * 9)/100;
        }
    }
}
