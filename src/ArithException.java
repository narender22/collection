public class ArithException {
    public static void main(String[] args) {
        int a=5, b=1;
        try{
            System.out.println(a/b);
            throw new NullPointerException("demo");
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Exception hapenned");
        }
        catch (NullPointerException e){
            System.out.println("Throws Called");
        }
        finally {
            System.out.println("Code completed");
        }
    }
}