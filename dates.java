import java.util.Calendar;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
        
public class dates {
    public static void main(String args[]) throws Exception {
                    
          SimpleDateFormat  date_format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);   // SimpleDateFormat instance
          Calendar cal     = Calendar.getInstance();    // Calender instance
          TimeUnit time = TimeUnit.DAYS;                // TimeUnit time instance 
          
          Date first_dose_date        =   date_format.parse("04/22/2020");                 
          Date second_dose_date   =   date_format.parse("05/12/2020");                 
          
          long diff = second_dose_date.getTime() - first_dose_date.getTime();
          long difference = time.convert(diff, TimeUnit.MILLISECONDS);
          System.out.println("Difference Days : " + difference);
          
          String first = "04/22/2020";        
          
          try   {
                    //Setting the date to the given date
                    cal.setTime(date_format.parse(first));
          } catch(ParseException e)        {   e.printStackTrace();    }
	   
	cal.add(Calendar.DAY_OF_MONTH, 7);          //Number of Days to add
	String newDate = date_format.format(cal.getTime());  //Date after adding the days to the given date
	System.out.println("Date after Addition: "+newDate); //Displaying the new Date after addition of Days
                      
                    System.out.println(first_dose_date);
                    System.out.println(date_format.format(cal.getTime()));
    }
}
