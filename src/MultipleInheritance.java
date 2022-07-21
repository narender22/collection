/**
 * first method to print contents
 */
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

    /**
     * Class to implement multiple inheritance
     */
class MultipleInheritanceClass implements PrintAble,ShowAble{
        /**
         * declare methodToPrint body from the interfaces
         */
    public void methodToPrint(){
        System.out.println("Printable called");
    }
}

public class MultipleInheritance {
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
//      object named inheritanceObj of type MultipleInheritanceClass to test Multiple inheritance
        MultipleInheritanceClass inheritanceObj = new MultipleInheritanceClass();
//        call methodToPrint object from first interface
        inheritanceObj.methodToPrint();

    }
}
