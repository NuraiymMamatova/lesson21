package HomeWork;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner ;
        FileReader fileReader = new FileReader("Az09");
        scanner = new Scanner(fileReader);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
               fileReader.close();

}
}
