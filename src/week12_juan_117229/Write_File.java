package week12_juan_117229;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Write_File {

    public static void main(String[] args) {

        try {
            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }

}
