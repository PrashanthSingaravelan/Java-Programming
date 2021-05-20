package assignment_question;
        
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.Locale;

interface GlobalConstants {
    SimpleDateFormat  date_format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH); // SimpleDateFormat instance
}

class Donor implements GlobalConstants{
         String name;
         int age;
         String address;
         long num1;
         String blood_group;
         static Date donation_date;
    
        Donor(String name_main , int age_main , String address_main , long num1_main , String blood_group_main , String date_main) {
            this.name             = name_main;
            this.age                = age_main;
            this.address         = address_main;
            this.num1             = num1_main;
            this.blood_group = blood_group_main;
            try{ this.donation_date = date_format.parse(date_main); } catch (Exception e) { }             
    }
}
        
public class Assignment_question {
    public static void main(String[] args) {
         Donor[] obj1 = new Donor[4];
         obj1[0] = new Donor("Prashanth" , 24 , "No:54, 14th street, Kodambakkam" , 9003075249L,   "B+ve" , "17/05/21") ; 
         obj1[1] = new Donor("Kumar"       , 56 , "No:67, 18th street, Canada"             , 88795429382L, "A+ve" , "15/08/2020");
         obj1[2] = new Donor("Pradeep"     , 71 , "No:79 20th street Belgium"             , 9952415524L,  "O+ve" , "4/06/2021");
         obj1[3] = new Donor("Arun Kumar" , 39 , "No:56 19th street Kolkata"            , 8852466990L,   "B+ve" , "09/05/2021");
         
         // Object serialization
         try{
                   FileOutputStream fos      = new FileOutputStream("serial");
                   ObjectOutputStream oos = new ObjectOutputStream(fos);
                   for(int i=0;i<4;i++) { oos.writeObject(obj1[i]); }
         } catch(Exception e) {}
        
       // Object deserialization
        try {
                   Donor[] obj2 = new Donor[4];
                   FileInputStream fis      = new FileInputStream("serial");
                   ObjectInputStream ois = new ObjectInputStream(fis);
                   for(int i=0;i<4;i++) { obj2[i] = (Donor[i])ois.readObject(); } 
        } catch(Exception e) {}
        
        
 
   }
}