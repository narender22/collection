/**
 * program to test Exception
 */
public class ArithException {
    /**
     * main block
     */
    public static void main(String[] args) {

        // some testing variables
        int testVariable1=5, testVariable2=1;

        // try block will throw exception
        try{
            System.out.println(testVariable1/testVariable2);

            // to purposely throw a NullPointerException.
            throw new NullPointerException("demo");
        }

        // this will catch teh Arithmetic Exceptions like divide by zero
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception happened");
        }

        // this block will catch the null pointer exception
        catch (NullPointerException e){
            System.out.println("Throws Called");
        }

        /*
            finally block will run just after try block
            whether any exception is raised or not
        */
        finally {
            System.out.println("Code completed");
        }
    }
}
