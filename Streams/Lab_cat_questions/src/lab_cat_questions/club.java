package lab_cat_questions;

class  club_1 {
        int Member_number; 
        String club_Name;
        String workingplace;
        int Year_of_joining;
        String nominee_Name;
        int fees;
        int time_period;
        
        club_1(int Member_number_main , String Name_main ,String workingplace_main , 
                int Year_of_joining_main , String nominee_Name_main ,int fees_main , int time_period_main ) {
            
            this.Member_number = Member_number_main;
            this.club_Name = Name_main;
            this.workingplace = workingplace_main;
            this.Year_of_joining = Year_of_joining_main;
            this.nominee_Name = nominee_Name_main;
            this.fees = fees_main;
            this.time_period = time_period_main;
            
        }
} 

class member extends club_1         {
    int Member_id;
    String member_Name;
    int Max_activites;
            
            member( int Member_number_main , String Name_main ,String workingplace_main , 
                int Year_of_joining_main , String nominee_Name_main ,int fees_main , int time_period_main ,int Member_id_main , 
                String member_Name_main , int Max_activites_main )    {
                
                super(Member_number_main, Name_main, workingplace_main, Year_of_joining_main, 
                        nominee_Name_main, fees_main , time_period_main);
                
                this.Member_id = Member_id_main;
                this.member_Name = Name_main;
                this.Max_activites = Max_activites_main;
            }
}

class club_member_inherit extends member {
    
}

public class club {
    public static void main(String args[]) {
    }
}
