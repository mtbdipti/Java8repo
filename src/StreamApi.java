
import java.util.ArrayList;
import java.util.stream.Stream;
public class StreamApi{
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
//        Stream s1=al.stream();
//        s1.forEach(e-> System.out.println(e));
//       Stream s2= Stream.of(al);
//       s2.forEach(e-> System.out.println(e));

//       Stream s3=Stream.of(100,200,300,400,500);
//       s3.forEach(e-> System.out.println(e));

        Stream s4=Stream.empty();//empty
        Stream s5=Stream.builder().build();//empty

    }
}
