
abstract class Bank{
    abstract int getRateOfInterest();
    abstract String getName();
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }

    String getName(){
        return "SBI";
    }
}

class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }

    String getName(){
        return "PNB";
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Bank b1=new SBI();
        Bank b2=new PNB();

        System.out.println(b1.getName()+ " gives " + b1.getRateOfInterest() + "% Rate of interest");
        System.out.println(b2.getName()+ " gives " + b2.getRateOfInterest() + "% Rate of interest");
    }
}
