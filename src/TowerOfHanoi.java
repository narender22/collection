/**
 * program to solve tower of hanoi problem
 * i.e. to move plates from 1 rod to another 1 move at a time in increasing order of size.
 */
public class TowerOfHanoi {
/*
    method to solve tower of hanoi problem.
 */
    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod){
        if (n==0){
            return;
        }
        towerOfHanoi(n-1, fromRod, auxRod, toRod);
        System.out.println("Move disk "+n+ " from rod " + fromRod + " to rod "+ toRod);
        towerOfHanoi(n-1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        /*
         for 3 rods A, B and C.
         let us find moves for number of plates to be 4.
         */
        int noOfPlates=4;
        towerOfHanoi(noOfPlates, 'A', 'C', 'B');
    }
}
