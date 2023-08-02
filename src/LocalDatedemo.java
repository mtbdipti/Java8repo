import java.time.LocalDate;
import java.time.Month;

public class LocalDatedemo {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        Month month= today.getMonth();
        System.out.println(month);
        LocalDate s=today.minusMonths(6);
        System.out.println(s);
        Boolean t=today.isLeapYear();
        System.out.println(t);

    }
}
