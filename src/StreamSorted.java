import java.util.ArrayList;

public class StreamSorted{
    public static void main(String[] args) {
        ArrayList<String> al1= new ArrayList<>();
        al1.add("Badshah");
        al1.add("Ranajay");
        al1.add("Rupkotha");
        al1.add("Iman");
//        al1.stream().sorted().forEach(e-> System.out.println(e));
        al1.stream().sorted((x,y)->-x.compareToIgnoreCase(y)).forEach(e-> System.out.println(e));


    }
}
