import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Datas!");

        // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");



        LocalDate d01 = LocalDate.now();  // data local 
        LocalDateTime d02 = LocalDateTime.now();  // Data local e hora completa atual
        Instant d03 = Instant.now();  // data e hora atual global GMT fuso horario GMT-0

        LocalDate d04 = LocalDate.parse("2025-04-30");  // passando o formado da data
        LocalDateTime d05 = LocalDateTime.parse("2025-04-30T08:23:00");  // passando a data e hora como texto
        Instant d06 = Instant.parse("2025-04-30T08:27:00Z");
        Instant d07 = Instant.parse("2025-04-30T08:27:00-03:00"); // passando o fuso horario
        // o localDate e o localDateTime ja utiliza o toString no final como padrão
        LocalDate d08 = LocalDate.parse("02/05/2025", fmt1);  // passando a data e hora como texto
        LocalDate d09 = LocalDate.parse("02/05/2025 17:30", fmt2);  // passando a data e hora como texto

        LocalDate d10 = LocalDate.of(2025, 05, 10);
        LocalDateTime d11 = LocalDateTime.of(2025, 05, 20, 17, 30, 20);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
    }
}
