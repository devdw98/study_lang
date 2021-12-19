package ex10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
    static void printSunday(int year){
        Calendar calendar = Calendar.getInstance();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        for(int i = 0; i < 12; i++){
            calendar.set(Calendar.MONTH, i);
            Date date = calendar.getTime();
            format.format(date);
        }

    }
    public static void main(String[] args) {
        
    }
}
