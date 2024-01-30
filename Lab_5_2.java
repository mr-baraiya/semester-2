// Deƒne Time class with constructor to initialize hour and minute. Also deƒne addition method to add two time objects.
import java.util.*;

class Time{
    int hour, minute;
    void setHour(Time t1, Time t2){
        this.hour = t1.hour + t2.hour;
        this.minute = t1.minute + t2.minute;
    }
}
Time(int hour, int minute){
    this.hour = hour;
    this.minute = minute;
}

public class Lab_5_2 {
    public static void main(String[] args) {
        Time t1 = new Time(3,70);
        Time t2 = new Time(2,30   );
        Time t3 = new Time(0,0);
        System.out.println(t3.hour+":"+t3.minute);
    }
}
