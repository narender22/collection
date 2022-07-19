/**
 * Program to test working of threads
  */
public class ThreadExample {
//    initialize a counter
    int counter=1;
    static int NUM;

    /**
     * method to print odd numbers
     */
    public void displayOddNumber(){
//        we need to use synchronized blocks otherwise we will get an exception
        synchronized (this){
            while (counter<NUM){
                while (counter % 2 == 0){
                    try {
                        wait();
                    }
                    catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                //            printing the number
                System.out.println(counter + " ");
//            increment the counter
                counter = counter + 1;
//            notify the waiting thread
                notify();
            }
        }
    }

    /**
     * method to print even numbers
     */
    public void displayEvenNumber(){
        synchronized (this){
            while (counter < NUM){
                while (counter % 2 == 1){
                    try {
                        wait();
                    }
                    catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
//                print the number
                System.out.print(counter + " ");
//                increment the counter
                counter = counter + 1;
//                notify the second thread
                notify();
            }
        }
    }

//    main thread
    public static void main(String[] args) {
        NUM = 20;

//        creating an object of ThreadExample
        ThreadExample th= new ThreadExample();
//        creating thread1
        Thread th1=new Thread(th::displayEvenNumber);

//        creating thread 2
        Thread th2=new Thread(th::displayOddNumber);
        th1.start();
        th2.start();
    }
}
