public class ArithException {
    public static void main(String[] args) {
        int a=5, b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Exception hapenned");
        }
        finally {
            System.out.println("Code completed");
        }
    }
}
