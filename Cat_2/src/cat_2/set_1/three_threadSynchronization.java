package cat_2.set_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class votes {
    Random r =new Random();
    int no;
    int []MLA_seats;
    int cand_1=0,cand_2=0,cand_3=0;
    List <Integer> result;
    
    votes(int n)    {
        this.no=n;
        MLA_seats=new int[no];
        for (int i=0;i<no;i++)  {   MLA_seats[i]=r.nextInt(3)+1;     }
    }
    
     synchronized public void add_vote(int index)    {
       for(int i=0;i<60;i++)    {
           switch(MLA_seats[i+index])   {
               case 1:  cand_1+=1;   break;
               case 2:  cand_2+=1;   break;
               case 3:  cand_3+=1;   break;
           }
        }
     }
     
     public void setResult()    {
       
         result=new ArrayList<>();
           result.add(cand_1);
           result.add(cand_2);
           result.add(cand_3);
     }
           
       public List<Integer> getCount()  {
           setResult();
           return result;
       } 
}

class Counter extends Thread    {
    int index;
    three_threadSynchronization p;   // main thread
    votes v;
    
    Counter(String name,int index,votes v)  {
        super(name);
        this.index=index;
        this.v=v;
    }
    
    @Override
    public void run(){
        v.add_vote(index);
    }
}

public class three_threadSynchronization  {
    public static void main(String args[])throws Exception{
       
            votes v = new votes(240);
            int []cand=new int[3];
            List<Integer> results;
            Map<Integer,String> d = new HashMap<>();
            d.put(1,"OPS");
            d.put(2,"EPS");
            d.put(3,"Stalin");
            int CM=0;
            
            Counter c1 = new Counter("C1",0,v);
            Counter c2 = new Counter("C2",60,v);
            Counter c3 = new Counter("C3",120,v);
            Counter c4 = new Counter("C4",180,v);
            c1.start();
            c2.start();
            c3.start();
            c4.start();

            Thread.sleep(1000);
            results=v.getCount();

            for (int i =0; i < 3; i++) { cand[i] = results.get(i); }
            
            System.out.println("OPS- "+cand[0]);
            System.out.println("EPS- "+cand[1]);
            System.out.println("Stalin- "+cand[2]);
            int max=0;            
            
            for(int j=0;j<3;j++)  {
                           if (max<cand[j]) {
                               max=cand[j];
                               CM=j+1;
                           }
                        }
            System.out.println("So the next Chief Minister is "+d.get(CM)); 
    }
}