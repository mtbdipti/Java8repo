import java.util.ArrayList;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<>();
        al1.add("Prabudh");
        al1.add("Nandighosh");
        al1.add("Chiranjibi");
        al1.add("Subhashish");
        al1.stream().map(str->str.charAt(0)).forEach(i-> System.out.println(i));
        al1.stream().map(str->str.replaceFirst("a","z")).forEach(b-> System.out.println(b));
    }
}
