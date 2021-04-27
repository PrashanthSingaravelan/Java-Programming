package cat_2.set_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class difference_between_two_dates {
    public static void main(String args[]) {
       SimpleDateFormat  date_format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);   // SimpleDateFormat instance
       Calendar cal     = Calendar.getInstance();    // Calender instance
       TimeUnit time = TimeUnit.DAYS;                // TimeUnit time instance 
       
        try {
          Date first_dose_date  =   date_format.parse("22/04/2020");           
          Date present_date       =  new Date();  // current system date
          
          System.out.println(date_format.format(present_date));
          System.out.println(date_format.format(first_dose_date));
          
          long diff = present_date.getTime() - first_dose_date.getTime();
          long difference = time.convert(diff, TimeUnit.MILLISECONDS);
          System.out.println("Difference Days : " + difference);
          
        } catch(Exception e)  {}
    }
}
