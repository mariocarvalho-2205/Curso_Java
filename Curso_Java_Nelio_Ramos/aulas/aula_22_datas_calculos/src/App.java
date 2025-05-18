
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-20T01:30:26");
        Instant d06 = Instant.parse("2025-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);  // subtrai
        LocalDate nextWeekLocalDate = d04.plusDays(7);        // adiciona

        
        System.out.println("nextWeekLocalDate " + nextWeekLocalDate);
        System.out.println("pastWeekLocalDate " + pastWeekLocalDate);
        
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(2);  // subtrai
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(2);        // adiciona
        
        
        System.out.println("nextWeekLocalDateTime " + nextWeekLocalDateTime);
        System.out.println("pastWeekLocalDateTime " + pastWeekLocalDateTime);
        
        
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);  // subtrai
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);        // adiciona
        
        System.out.println("nextWeekInstant " + nextWeekInstant);
        System.out.println("pastWeekInstant " + pastWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t1 dias " + t1.toDays());

    }
}
