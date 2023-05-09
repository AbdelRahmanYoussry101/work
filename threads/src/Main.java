import java.io.*;
import java.lang.Thread;


public class Main {
    public static void main(String[] args) {
        int x=11;
        try{
            CheckAge(x);
        }catch (Exception e){
            System.out.println("Exception:"+e);
        }

    }
    static void CheckAge(int num_age) throws AgeChecker{
        if(num_age>10){
            throw new AgeChecker("too big age");
        }else{
            System.out.println("verfied");
        }
    }
//file stuff
    FileWriter W_F;
    {
        try {
            W_F = new FileWriter("poem.txt");
            W_F.write("helo");
            W_F.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    FileReader M_F;
    {
        try {
            M_F = new FileReader("pete.txt");
            int data = M_F.read();

            while(data !=-1){
                System.out.print((char)data);
                data = M_F.read();
            }
            M_F.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
// threads

    MyThread thread1 = new MyThread();

    MyRunnable runnable1 = new MyRunnable();
    Thread thread2 = new Thread(runnable1);

    thread1.Start();
    thread2.Start();

}