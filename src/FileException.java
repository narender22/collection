import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * program to test file exception
 */
public class FileException {
    /**
     * main method
     */
    public static void main(String[] args) {
        /*
        try block to access a text file in local system
         */
        try {
/*
            creating a file and reading from local library ""C:\\Users\\naku274274\\Desktop\\gt.txt""
 */
            FileReader file=new FileReader("C:\\Users\\naku274274\\Desktop\\gt.txt");

/*
        reading content from the file stream
 */
            BufferedReader fileInput = new BufferedReader(file);

/*
        printing content from the file gt.txt
 */
            for (int i=0; i<3; i++){
                System.out.println(fileInput.readLine());
            }

/*
            closing file after reading all its content
 */
            fileInput.close();
        }
        /*
         * if IOException occurs
         */
        catch (IOException e){
            /*
            this exception will be raised if the file gt.txt is not found.
             */
            System.out.println("No file found with the given name");
        }

        /*
           run finally block after try block
         */
        finally {
            System.out.println("Code completed");
        }
//
    }
}
