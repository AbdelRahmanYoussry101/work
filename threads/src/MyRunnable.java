public class MyRunnable implements Runnable{
 public void run(){
     for(int i=10;i>0;i--){
         System.out.println("Thread#1= "+ i);
         try {
             Thread.sleep(1000);
         }
         catch (Exception e){
             e.printStackTrace();
         }

     }
     System.out.println("Finished Thread #1");
    }
}
