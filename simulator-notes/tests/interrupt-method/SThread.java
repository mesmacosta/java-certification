/*
 * The exercise shows in Exam Lab test and I wanted to find out what
 * the `interrupt()` method does.
 *
 * Result: it makes the `InterruptedExecption` be thrown.
 */
public class SThread implements Runnable{
    public void run(){
        //try{
            System.out.print("A");
            //Thread.sleep(1000);
            System.out.print("B");
        //}catch(InterruptedException ie){
            //System.out.print("Thread Interrupted");
        //}
    }
    public static void main(String args[]){
        Thread t=new Thread(new SThread());
        t.start(); t.interrupt();
    }
}
