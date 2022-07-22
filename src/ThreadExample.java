/**
 * Program to test working of threads
 */
public class ThreadExample {
/*
    initialize a counter
 */
    int counter=2;
//    declare a global static variable as NUM
    static int NUM;

    /**
     * method to print odd numbers
     */
    void displayOddNumber(){
/*
        we need to use synchronized blocks otherwise we will get an exception
 */
        synchronized (this){
            while (counter<NUM){
//                if counter is even, wait
                while (counter % 2 == 0){
                    try {
                        wait();
                    }
                    catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                //            printing the odd number
                System.out.println(counter + " ");
//            increment the counter
                counter = counter + 1;
//            notify the waiting thread to continue
                notify();
            }
        }
    }

    /**
     * method to print even numbers
     */
    void displayEvenNumber(){
        synchronized (this){
            while (counter < NUM){
//                if counter is odd, wait
                while (counter % 2 == 1){
                    try {
                        wait();
                    }
                    catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
//                print the even number
                System.out.print(counter + " ");
//                increment the counter
                counter = counter + 1;
//                notify the second thread to continue
                notify();
            }
        }
    }

/**
 * main thread
 */
    public static void main(String[] args) {
/*
        define the global static variable as NUM
 */
        NUM = 21;

//        creating an object of ThreadExample
        ThreadExample th= new ThreadExample();

//        creating thread1
        Thread thread1=new Thread(th::displayEvenNumber);

//        creating thread 2
        Thread thread2=new Thread(th::displayOddNumber);

//        starts both threads
        thread1.start();
        thread2.start();
    }
}
