package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;
    public double netSalary;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.percentage = this.grossSalary * (percentage / 100);
    }
}