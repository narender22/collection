// program to test interface working

// define an interface with 4 methods
interface A{
    void a();
    void b();
    void c();
    void d();
}

// define an abstract class which implements the interface A
abstract class B implements A{
//    define method c from the interface
    public void c(){
        System.out.println("I am C");
    }
}

// define a class which extends the abstract class B
class M extends B{
//    define method a from the interface
    public void a(){
        System.out.println("I am A");
    }

//    define method b from interface
    public void b(){
        System.out.println("I am B");
    }

//    define method d from interface
    public void d(){
        System.out.println("I am D");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
//        create an instance of class M which extends abstract class B which implements Interface A
        A a=new M();

//        check all the methods from interface
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
