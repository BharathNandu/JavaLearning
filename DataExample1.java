import java.time.LocalDate;

public class DataExample1 {

    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println("today's date " +date );

        LocalDate yesterday = date.minusDays(1);
            System.out.println("Yesterday is "+yesterday);
        LocalDate lastmonth = date.minusMonths(1);
        System.out.println("lastmonth " +lastmonth);

    }
    
}
