import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDemo {
    public static void main(String[] args) {
        Set<String> ids=
                ZoneId.getAvailableZoneIds();
        System.out.println(ids);
        ZoneId id=ZoneId.of("America/Cuiaba");
        LocalTime lts1=LocalTime.now(id);
        System.out.println(lts1);
        ZonedDateTime zs=ZonedDateTime.now();
        System.out.println(zs);

    }
}
