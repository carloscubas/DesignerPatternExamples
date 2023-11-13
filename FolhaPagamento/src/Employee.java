public class Employee {

    private double workHours= 0.0;

    private double valueSalaryHour = 0.0;

    private int numberDependents = 0;

    public Employee(double workHours, double valueSalaryHour, int numberDependents) {
        this.workHours = workHours;
        this.valueSalaryHour = valueSalaryHour;
        this.numberDependents = numberDependents;
    }

    public double baseSalary(){
        return workHours * valueSalaryHour + (50 * numberDependents);
    }
}
