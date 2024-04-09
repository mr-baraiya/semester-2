import java.io.*;
import java.util.*;

class MyThread extends Thread{
    public MyThread(){
        //super();
        start();
    }
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("Vishal Baraiya"+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
public class ThreadDemo {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        try {
            for(int i=0;i<20;i++){
                System.out.println("Main Thread");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}