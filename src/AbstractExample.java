/**
 * program to test abstract class
 */
abstract class Bank{
    /**
     * to get the rate of interest of the bank
     */
    abstract int getRateOfInterest();

    /**
     * this method will return the name of the bank
     */
    abstract String getName();
}

/**
 * class for SBI bank
 */
class SBI extends Bank{
    /**
     * SBI bank has 7% rate of interest
     */
    int getRateOfInterest(){
        return 7;
    }

    /**
     * this will get us the bank name
     */
    String getName(){
        return "SBI";
    }
}

/**
 * information for PNB bank
 */
class PNB extends Bank{
    /**
     * interest in PNB is 8% pa
     */
    int getRateOfInterest(){
        return 8;
    }

    /**
     * this will give us the bank name
     */
    String getName(){
        return "PNB";
    }
}

/**
 * main class
 */
public class AbstractExample {
    /**
     * main block
     */
    public static void main(String[] args) {
//        object for SBI bank
        Bank bank1=new SBI();
//        object for PNB named
        Bank bank2=new PNB();

        System.out.println(bank1.getName()+ " gives " + bank1.getRateOfInterest() + "% Rate of interest");
        System.out.println(bank2.getName()+ " gives " + bank2.getRateOfInterest() + "% Rate of interest");
    }
}
