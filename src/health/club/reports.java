//youssef ahmed id:201900976
package health.club;
import java.util.ArrayList;


public class reports {

    
    private final String reportsFileName = "reports.txt";
    
    public static ArrayList<reports> reports = new ArrayList<>();
    private int M_Id;
    private int M_age;
   private  String M_name;
   private  int subs_month;
   FileManger FManger = new FileManger();
   
   reports() {
         
    }
    
    
   
    public reports (int M_Id , int M_age , String M_name,int subs_month){
        this.M_Id= M_Id;
        this.M_age=M_age;
        this.M_name=M_name;
        this.subs_month = subs_month;
        
    }

    

    

     

    

    

    
    public void SetMemberId(int M_Id) {
        this.M_Id = M_Id;
    }
    
     public void SetMemberAge(int M_age) {
        this.M_age = M_age;
    }
     
      public void SetMemberName(String M_name) { 
        this.M_name = M_name; 
    }
    
     public void SetMemberSubsM(int subs_month ) {
        this.subs_month = subs_month; 
    }  
     
     public int GetMemberId() {
        return this.M_Id;
    }
     
     public int GetMemberAge(int M_age) {
       return this.M_age;
    }
     
    public String GetMemberName(String M_name) { 
        return this.M_name ; 
    }  
    
     public int GetMemberSubsM( ) {
        return this.subs_month ; 
    }  
    
     
      public void loadFromFile() {
           reports = (ArrayList<reports>) (Object) FManger.read(reportsFileName);}
    
    
    
      private int GetMemberIndex(int M_Id){
        for (int i = 0; i < reports.size(); i++)
            if(reports.get(i).GetMemberId() == M_Id)
                return i;
        
        return -1;
    }
      
    
      
       public String displayReports() {
        loadFromFile();
        String S = "\\n";
        for (reports x :reports) {
            S = S + x.toString();
        }
        return S;
        
        
        
    
    } 
      public String SearchMember(int id){
        loadFromFile();
        int index = GetMemberIndex(id);
        if(index != -1)
            return "\nFound ...!" /*+displayReports();*/ +reports.get(index).toString();
            
        else 
            return "\nNot Found ...!";
    }
      
      
      public String SubsNotify(int id)
      {
      loadFromFile();
      //int current_month =3;
        int index = GetMemberIndex(id);
        reports x = new reports();
        if( index != -1 && reports.get(index).GetMemberSubsM()==3)  
               return "\n Subscribtion is going to end this month " ;
        
        else 
            return "\n";
      }
     
      @Override
    
    public String toString() {
     return "\n Member id:  " + M_Id+  " \nMember age:  "   + M_age +  "\n member name:  "+M_name+ "\n subs month:   "+subs_month+    "\n";
     
    }

    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

