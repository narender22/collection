/**
 * program to test interface working
  */


/**
 * define an interface with 4 methods
  */

interface testInterface{
    void method1();
    void method2();
    void method3();
    void method4();
}

/**
 * define an abstract class which implements the interface A
 */
abstract class TestAbstractClass implements testInterface{
//    define method c from the interface
    public void method3(){
        System.out.println("I am C");
    }
}

/**
 * define a class which extends the abstract class B
  */
class Test extends TestAbstractClass{
/*
    define method a from the interface
 */
    public void method1(){
        System.out.println("I am A");
    }

/*
    define method b from interface
 */
    public void method2(){
        System.out.println("I am B");
    }

/*
    define method d from interface
 */
    public void method4(){
        System.out.println("I am D");
    }
}

public class InterfaceExample {
    /**
     * main block
     */
    public static void main(String[] args) {
/*
        create an instance of class M which extends abstract class B which implements Interface A
 */
        testInterface testInterface=new Test();

/*
        check all the methods from interface
 */
        testInterface.method1();
        testInterface.method2();
        testInterface.method3();
        testInterface.method4();
    }
}
