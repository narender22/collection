/**
 * Java program implementing Singleton class
 * with using getInstance() method
 */
/*
Helper class
 */
class Singleton{
//    singleton variable
    private static Singleton singleInstance = null;

//    declaring a string


    /*
    Constructor
     */
    private Singleton(){
        String string;
        string="Hello I am a part of Singleton class";
        System.out.println(string);
    }

    /*
    to create an instance of Singleton class
     */
    static Singleton getInstance(){
        if (singleInstance == null){
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

/**
 * Main class
 */
public class SingletonClassExample {
    /*
    Main
     */
    public static void main(String[] args) {

        //        Instantiating Singleton class with variable var1
        Singleton var1 = Singleton.getInstance();

        //        Instantiating Singleton class with variable var1
        Singleton var2 = Singleton.getInstance();

        //        Instantiating Singleton class with variable var1
        Singleton var3 = Singleton.getInstance();

//        printing the hash code for the above variable as declared
        System.out.println(var1.hashCode());
        System.out.println(var2.hashCode());
        System.out.println(var3.hashCode());

        if (var1 == var2 && var2 == var3){
//            this proves the concept of singleton class.
            System.out.println("Three objects points to same memory location");
        }
        else {
            System.out.println("Three objects do not point to same memory location");
        }
    }
}
