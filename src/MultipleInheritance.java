interface PrintAble{
    void print();
}
interface ShowAble{
    void show();
}

class A7 implements PrintAble,ShowAble{
    public void print(){
        System.out.println("Printable called");
    }
    public void show(){
        System.out.println("Showable called");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
