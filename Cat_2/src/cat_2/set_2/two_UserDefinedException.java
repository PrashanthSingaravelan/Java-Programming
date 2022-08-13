package cat_2.set_2;

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

class invalidwarranty extends Exception {      
            @Override
            public String getMessage() {   
                return ("You have purchased this vehicle an year before " + 
                        "\nCustomer name : " + bike_service.cust_name + 
                        "\nBike Price : " + bike_service.bill_amount + 
                        "\nPurchase date : " + bike_service.purchase_date );
                    }
}

class bike_service implements GlobalConstants {
        static String cust_name;
        static int bill_amount;
        static int waranty_amount;
        static Date purchase_date;
        
        bike_service(String name , int  amount , int warranty , String date ) {
            this.cust_name = name;
            this.bill_amount = amount;
            this.waranty_amount = warranty;
            try{ this.purchase_date = date_format.parse(date); } catch (Exception e) { }            
        }
        
        public void bill() {
                System.out.println("Difference is not more than a year, So you can able to claim the warranty");
                System.out.println("Customer name : " + this.cust_name);
                System.out.println("Bike Price : " + this.bill_amount);
                System.out.println("Warranty amount : " + this.waranty_amount);
                System.out.println("Purchase date : " + this.purchase_date);    
        }
        
        public long days_difference(Date first_dose_date) {            
            Date present_date = new Date();
            long diff = present_date.getTime() - first_dose_date.getTime();
            long difference = time.convert(diff, TimeUnit.MILLISECONDS);
            return difference;
      }
        
        public void warranty() throws invalidwarranty  {
                long difference = days_difference(this.purchase_date);
                if (difference>=365) { 
                    System.out.println("Difference is more than a year, So you can't able to claim the warranty");
                    throw new invalidwarranty();             }
                else {  bill();  }
        }
}

public class two_UserDefinedException {
    public static void main(String args[]) {
        bike_service obj1 = new bike_service("Prashanth" , 1_00_000,20_000,"30/03/2020");
        try{ obj1.warranty();} catch(Exception e) {System.out.println(e.getMessage());}
        
        System.out.println("\n");
        
        bike_service obj2 = new bike_service("Mothish" , 2_00_000,15_000,"20/04/2021");
        try{ obj2.warranty();} catch(Exception e) {System.out.println(e.getMessage());}
    }
}
