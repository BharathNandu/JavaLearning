import java.time.LocalDate;

public class DateExample5 {

    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        String str = "2024-06-20";
        LocalDate date1 = LocalDate.parse(str);
        System.out.println(date1);

    }
    
}
