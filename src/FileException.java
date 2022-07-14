import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) throws IOException {
        try {
//            creating a file and reading from local
            FileReader file=new FileReader("C:\\Users\\naku274274\\Desktop\\gt.txt");

//        reading content
            BufferedReader fileInput = new BufferedReader(file);

//        printing
            for (int i=0; i<3; i++){
                System.out.println(fileInput.readLine());
            }

//            closing file
            fileInput.close();
        }
        catch (IOException e){
            System.out.println("No file found with the given name");
        }
        finally {
            System.out.println("Code completed");
        }
//
    }
}
