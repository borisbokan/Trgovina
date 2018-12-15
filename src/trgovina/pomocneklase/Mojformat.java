package trgovina.pomocneklase;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;

public class Mojformat {

    public static String DveDecimale(double _number) {
        NumberFormat nf = new DecimalFormat("#,###.00");
        return nf.format(_number);
    }
    
  
    public static Timestamp DateTime(int _year,int _month,int _dayInMonth,int _hour,int _minut,int _second){
        Calendar cal = Calendar.getInstance ();
        cal.set (_year, _month-1, _dayInMonth, _hour, _minut, _second);
        Timestamp time = new Timestamp (cal.getTimeInMillis ());
        
        return time;

    }
     
}
