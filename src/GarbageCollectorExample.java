/**
 * program to test garbage collection
 */
@SuppressWarnings("ALL")
public class GarbageCollectorExample {
    /**
     * finalize method is invoked each time before the object is garbage collected
     * this method is used to perform cleanup processing.
     */
    protected void finalize() {
/*
        this will run every time garbage collector runs
 */
        System.out.println("object is garbage collected");
    }

    /**
     * main block
     */
    public static void main(String[] args) {
/*
        creating an objects of GarbageCollectorExample.
 */
        GarbageCollectorExample g1 = new GarbageCollectorExample();
        GarbageCollectorExample g2 = new GarbageCollectorExample();
        g1 = null;
        g2 = null;
/*
       to invoke garbage collector to perform cleanup processing.
 */
        System.gc();
    }
}
