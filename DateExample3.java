import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateExample3 {

    public static void main(String[] args)
    {
        LocalDate date = LocalDate.of(2024, 5, 16);
        LocalDateTime datetime = date.atTime(1,5,10);
        System.out.println(datetime);
    }
    
}
