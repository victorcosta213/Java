import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate "+ pastWeekLocalDate);
        System.out.println("nextWeekLocalDate "+ nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),d04.atStartOfDay()); //como o LocalDate não fornece a hora tem que usar o .atStartOfDay() para formular a hora como meia noite
        Duration t2 = Duration.between(pastWeekLocalDateTime,d05);
        Duration t3 = Duration.between(pastWeekInstant,d06);
        Duration t4 = Duration.between(d06,pastWeekInstant);

        System.out.println("t1 Days:"+t1.toDays());
        System.out.println("t2 Days:"+t2.toDays());
        System.out.println("t3 Days:"+t3.toDays());
        System.out.println("t4 Days:"+t4.toDays());


    }
}