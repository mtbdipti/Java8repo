public class MethodConstructorRefDemo {
    public static void main(String[] args) {
//        A ob=new A();
//        i1 i=ob:: m2; //line 3 and 4 are example of method reference
//        i1 i=A::m2;
//        i.m1(); //line 5 and 6 are example of class reference
//        i1 i=A::new;//line 7 ,9,10 is an example of constructor ref

        i1 i2=A::new;
        i2.m1("java");
    }
}
interface  i1{
//    void m1();
    void m1(String str);
}
class A {
    A(){
        System.out.println("inside constructor of A");
    }
    A(String s){
        System.out.println("Hi"+" "+s);
    }

//    public static  void m2(){
//        System.out.println("inside static method");
//    }

//    public void m2() {
//        System.out.println("referred method");
//    }
}