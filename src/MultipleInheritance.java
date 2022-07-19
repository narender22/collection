// first method to print contents
interface PrintAble{
    /**
     * method to print some required content
     */
    void methodToPrint();
}

// second method to show contents
interface ShowAble{
    /**
     * method to show some required content
     */
    void methodToPrint();
}

// Class to implement multiple inheritance
class A7 implements PrintAble,ShowAble{
//    declare methodToPrint body from the interfaces
    public void methodToPrint(){
        System.out.println("Printable called");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
//      object of type A7 to test Multiple inheritance
        A7 obj = new A7();
//        call methodToPrint object from first interface
        obj.methodToPrint();

    }
}
