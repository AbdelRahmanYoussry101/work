import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // File and its methods
//        File file = new File("D:/COLLEGE TA/CC316 - OOP/Sections - Yasmina/files/file1.txt");
//        System.out.println("Does it exist? " + file.exists());
//        System.out.println("The file has " + file.length() + " bytes");
//        System.out.println("Can it be read? " + file.canRead());
//        System.out.println("can it be written? " + file.canWrite());
//        System.out.println("Is it a directory? " + file.isDirectory());
//        System.out.println("Is it a file? " + file.isFile());
//        System.out.println("Is it absolute? " + file.isAbsolute());
//        System.out.println("Is it hidden? " + file.isHidden());
//        System.out.println("Absolute path is " + file.getAbsolutePath());
//        System.out.println("Last modified on " + new Date(file.lastModified()));



        //List the name of all files in the directory
//        File dir1 = new File("D:/COLLEGE TA/CC316 - OOP/Sections - Yasmina/files");
//        String[] filenames = dir1.list();
//        for (int i=0; i<filenames.length; i++){
//            System.out.println(filenames[i]);
//        }



        //Reading file data using Scanner
//        File file = new File("src/file5.txt");
//
////        Scanner input = new Scanner(file);
//        try {
//            Scanner input = new Scanner(file);
//            int i = input.nextInt();
//            System.out.println(i);
//
//            double d = input.nextDouble();
//            System.out.println(d);
//
//            String s1 = input.next();
//            System.out.println(s1);
//
//            String s2 = input.next();
//            System.out.println(s2);
//
//            char x = (input.next()).charAt(0);
//            System.out.println(x);
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }



        // Write a program that reads the five values from a file and prints them along with their sum
//        double sum = 0.0;
//        File file = new File("src/Numbers.txt");
//        try {
//            Scanner input = new Scanner(file);
//            for (int i=0; i<5; i++){
//                double next = input.nextDouble();
//                System.out.println("number = " + next);
//                sum += next;
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
//        System.out.println("Sum = " + sum);



        // (Modified) Write a program that reads the five values from a file and prints them along with their sum
//        double sum = 0.0;
//        try {
//            Scanner input = new Scanner(new File("src/Numbers.txt"));
//            while (input.hasNextDouble()){
//                double next = input.nextDouble();
//                System.out.println("number = " + next);
//                sum += next;
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
//        System.out.println("Sum = " + sum);



        // Write a program that creates an instance of Scanner and reads data from scores.txt and display the content
//        File file = new File("src/Scores.txt");
//        try {
//            Scanner input = new Scanner(file);
//            while(input.hasNext()){
//                String firstName = input.next();
//                String midInit = input.next();
//                String lastName = input.next();
//                int score = input.nextInt();
//                System.out.println(firstName + " " + midInit + " " + lastName + " " + score);
//            }
//            input.close();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("File not found");
//        }



       // Write a program that creates an instance of PrintWriter and writes two lines to the file scores.txt
//        File file = new File("src/Scores.txt");
//        try{
//            PrintWriter output = new PrintWriter(file);
//            output.print("Johan T Smith ");
//            output.println(90);
//            output.print("Eric K Jones ");
//            output.println(85);
//            output.close();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("File doesn't exist");
//        }



        // Reading data from the web
        System.out.println("Enter a URL: ");
        String URLString = new Scanner(System.in).next();
        int count = 0;
        try{
            URL url = new URL(URLString);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
        }
        catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch (IOException e){
            System.out.println("IO Errors");
        }
        System.out.println("The file size is " + count + " characters");
    }
}