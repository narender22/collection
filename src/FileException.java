import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) throws IOException {
//        creating a file and reading from local
        FileReader file=new FileReader("C:\\Users\\naku274274\\Desktop\\git.txt");

//        reading content
        BufferedReader fileInput = new BufferedReader(file);

//        printing
        for (int i=0; i<3; i++){
            System.out.println(fileInput.readLine());
        }

//            closing file
        fileInput.close();
    }
}
