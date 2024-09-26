import java.io.*;
import java.util.*;

class MyThread implements Runnable{
    public void run() {
        for(int i=0 ;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    };
}
public class ThreadDemoInterface {
    public static void main(String[]args){
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        t1.start();
        System.out.println("Vishal Baraiya");
    }
}
