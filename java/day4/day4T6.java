/*Task 1: Creating and Managing Threads
Write a program that starts two threads,
 where each thread prints numbers from 1 to 10 with a 1-second delay between each number */
public class day4T6 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                   try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        t2.start();

            
        

    
}
}