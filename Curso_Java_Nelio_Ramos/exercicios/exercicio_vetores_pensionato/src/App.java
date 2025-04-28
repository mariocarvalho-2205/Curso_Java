import java.util.Locale;
import java.util.Scanner;

import entities.Rents;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pensionato Java!");

        String name, email;
        int room;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");

        int n = sc.nextInt();
        sc.nextLine();

        Rents[] vect = new Rents[10];

        for(int i = 0; i < n; i++) {
            System.out.printf("Rent #%d\n", i + 1);
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            sc.nextLine();

            vect[room] = new Rents(name, email, room);
        }

        System.out.println("Busy Rooms:");
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] != null) {
                System.out.println(vect[i]);
            }
        }



        sc.close();

    }
}
