import java.util.Locale;
import java.util.Scanner;

import entities.Student;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.print("Nota do primeiro trimestre (Maximo 30): ");
        student.grade1 = sc.nextDouble();
        System.out.print("Nota do segundo trimestre (Maximo 35): ");
        student.grade2 = sc.nextDouble();
        System.out.print("Nota do terceiro trimestre (Maximo 35): ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Final Grade = %.2f\n", student.finalGrade());

        if(student.isPassed()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }
    }
}
