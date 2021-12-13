class Thread123 extends Thread{
    public static Thread obj;
    public void run(){
        try{
            obj.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for (int i = 0 ;i<5;i++){
            System.out.println("in Thread123");
        }
    }
}
public class Threadings {
    public static void main(String[] args) {
        Thread123.obj = Thread.currentThread();
        Thread123 xyz =new Thread123();
        xyz.start();
        for(int i = 0;i<5;i++){
            System.out.println("in the main thread");
        }
    }
}
