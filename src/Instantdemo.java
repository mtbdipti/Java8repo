import java.time.Duration;
import java.time.Instant;

public class Instantdemo {
    public static void main(String[] args) throws InterruptedException {
        Instant start=Instant.now();
        Thread.sleep(500);
        Instant stop=Instant.now();
        Duration ds=Duration.between(start,stop);
        System.out.println(ds);
    }
}
