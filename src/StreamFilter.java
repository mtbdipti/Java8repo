import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
//        ArrayList<Integer> al=new ArrayList<>();
//        al.add(10);
//        al.add(27);
//        al.add(33);
//        al.add(40);
//       List l= al.stream().filter(i->i%2!=0).collect(Collectors.toList());
//        System.out.println(l);
//        al.stream().filter(i->i%2!=0).forEach(e-> System.out.println(e));
//        long a=al.stream().filter(s->s%2==0).count();
//        System.out.println(a);

        ArrayList<String> al2=new ArrayList<>();
        al2.add("Dipa");
        al2.add("Shiv");
        al2.add("Dipti");
        al2.add("noor");
        long r=al2.stream().filter(str->str.charAt(0)=='D').count();
        System.out.println("no of string start with r is"+" "+r);

    }
}
