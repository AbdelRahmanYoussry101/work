import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please Enter the file name.");
        String fileName = new Scanner(System.in).next();
        File file = new File("src/" + fileName);

        int lineNum = 0;
        int wordCount = 0;
        int charCount = 0;


        try{
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lineNum++;
                String[] words = line.split((" "));
                wordCount += words.length;
                charCount += line.length();
            }
            input.close();

            System.out.println(lineNum);
            System.out.println(wordCount);
            System.out.println(charCount);
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}