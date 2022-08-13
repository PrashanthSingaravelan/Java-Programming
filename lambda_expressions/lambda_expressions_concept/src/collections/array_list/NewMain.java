class INVALIDSQFT extends Exception{
        public String tostring(){
        System.out.println("Exception caught");
        return null;
        }
}


public class Main{
int acc_no;
String user_name;
static int n;
static Scanner s=new Scanner(System.in);
Main(int ac_no,String name)

{
this.acc_no=ac_no;
this.user_name=name;
}
void personalinfo(int ac_no,String name,float bal)
{
    System.out.println("Your number is: ",acc_no);
    System.out.println("Your name:",name);
}
void land_info(){
        System.out.println("Your building information is:);
}
void tax_info(int sqft_reading)
    { 
        
    if(sqft_reading==0){
    try{
    throw new INVALIDSQFT (sqft_reading);
        }
    catch (INVALIDSQFT e)
        {
    System.out.println(e);
    System.out.println("Exception caught");
        }
    }
}

public static void main(String[]args){
System.out.println("Enter account number:");
int ac_no=s.nextInt();
System.out.println("Enter user name");
String name=s.next();

Main m =new Main(ac_no,name);

m.personalinfo();
m.buildinginfo();
m.tax_info(1000);
}


