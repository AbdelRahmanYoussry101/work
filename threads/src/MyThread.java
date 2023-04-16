public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread#2= "+ i);
         try {
            Thread.sleep(1000);
        }
            catch (Exception e){
             e.printStackTrace();
        }

        }
        System.out.println("Finished Thread #2");
    }
}
