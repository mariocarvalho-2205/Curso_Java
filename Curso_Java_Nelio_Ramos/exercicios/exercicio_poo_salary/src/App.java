import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculo Salarial!");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        employee.percentage = sc.nextDouble();
        employee.increaseSalary(employee.percentage);

        System.out.printf("Update: %s, $ %.2f", employee.name , (employee.netSalary() + employee.percentage)  );
        sc.close();
    }
}
