import java.time.LocalDate;

public class DateExample2 {


    public static void main(String[] args)
    {
        LocalDate date = LocalDate.of(2024, 05, 16);
        if(date.isLeapYear())
        {
            System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("it is non leap year");
        }
    }
    
}
