import java.time.LocalTime;

public class LocalTimdedemo {
    public static void main(String[] args) {
        LocalTime today=LocalTime.now();
        System.out.println(today);
        LocalTime selfset=LocalTime.of(15,7,6);
        System.out.println(selfset);


    }



}
