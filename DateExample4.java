import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample4 {

    // converting date into string
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        String str = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println(str);

        LocalDate date1 = LocalDate.of(2024, 5, 16);
        String str1 = date1.format(DateTimeFormatter.ISO_DATE);
        System.out.println(str1);
    }
    
}
