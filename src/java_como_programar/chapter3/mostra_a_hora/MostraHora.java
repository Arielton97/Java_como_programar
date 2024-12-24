package java_como_programar.chapter3.mostra_a_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MostraHora {
    public static void main(String[] args) {
        // instanciar a data e hora local
        LocalDate d01 = LocalDate.now();
        LocalTime t01 = LocalTime.now();
        LocalDateTime dt01 = LocalDateTime.now();
        Instant i01 = Instant.now();

        System.out.println(d01);
        System.out.println(t01);
        System.out.println(dt01);
        System.out.println(i01);
    }
}
