package cat_2.set_1;

import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

interface GlobalConstants   {
            SimpleDateFormat  date_format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH); // SimpleDateFormat instance
            Calendar cal     = Calendar.getInstance();    // Calender instance
            TimeUnit time = TimeUnit.DAYS;                // TimeUnit time instance 
        }

class timeintraveller extends Exception implements GlobalConstants  {
          
          String first_dose_date_exception;
          int date_add;
          String newDate;
          
          timeintraveller(Date date,long date_add)  {    
              this.first_dose_date_exception = date_format.format(date);           
              this.date_add = (int)date_add;
          }
          
          String date() {
             try {   cal.setTime(date_format.parse(first_dose_date_exception)); }  catch(Exception e) {}
             cal.add(Calendar.DAY_OF_MONTH, date_add);          //Number of Days to add
             String newDate = date_format.format(cal.getTime());  //Date after adding the days to the given date
             return newDate;
          }
          
          @Override
          public String getMessage()    {              
               return ("You have still " + date_add + " days and Your next vaccine date : " + date());
          }
}

class vaccination_camp implements GlobalConstants{
        
        String patient_name;
        int patient_age;
        Date first_dose_date;
        
        vaccination_camp(String name, int age , String dose_one) {   // vaccination_camp constructor 
            this.patient_name = name;
            this.patient_age = age;
            try{  this.first_dose_date = date_format.parse(dose_one); } catch(Exception e) {} 
        }
        
        public long days_difference(Date first_dose_date) {            
            Date present_date = new Date();
            long diff = present_date.getTime() - first_dose_date.getTime();
            long difference = time.convert(diff, TimeUnit.MILLISECONDS);
            return difference;
        }
        
          public void time_period() throws timeintraveller {                  
                    long difference = days_difference(this.first_dose_date);
                    
                    if (difference<25)          {  
                        System.out.println("Difference is less than 25");
                        throw new timeintraveller(this.first_dose_date,25-difference);        }
                    else {
                        System.out.println("Your vaccination is successful");
                        System.out.println("Patient details");
                        System.out.println("Name : " + this.patient_name + "\nAge : " + this.patient_age);
                    }
          }
}

public class two_UserDefinedException implements  GlobalConstants {    
    public static void main(String args[]) {          
          vaccination_camp obj1 = new vaccination_camp("Prashanth" , 20,"22/05/2021");
          try{ obj1.time_period();} catch(Exception e) {System.out.println(e.getMessage());}
    }
}
