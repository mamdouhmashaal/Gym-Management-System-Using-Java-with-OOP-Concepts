
package health.club;

import java.util.ArrayList;


public class Coaches extends Person {
   
    
    private final String CoachFileName = "coach.txt";
    public static ArrayList<Coaches> Coach = new ArrayList<Coaches>();
    public Coaches(){
    }
    public Coaches(int id,String userName, String name , int pass){
           super( id, userName, name, pass);
    }
    
  //mamdouh mashaal id:201900845
      private String getCoachData(){
        return this.id + "@" + this.userName + "@" + this.name + "@" + this.pass + "@";
    }
       public String Getcoachdata(){
             
           return  this.id + "@" + this.name + "@" ;  
         }
       //mamdouh mashaal id:201900845
      public void loadFromFile() {
           Coach = (ArrayList<Coaches>) (Object) FManger.read(CoachFileName);
    }
      //mamdouh mashaal id:201900845
     public boolean addCoach() {
        if (FManger.write(getCoachData(),CoachFileName, true)) {
            return true;
        } else {
            return false;
        }
        
        
    }
     //mamdouh mashaal id:201900845
     public String ListAllCoaches() {
        loadFromFile();
        String S = "\nAll Coaches Data:\n";
        for (Coaches x : Coach) {
            S = S + x.toString();
        }
        return S;
    }
       
//mamdouh mashaal id:201900845
      private void commitToFile() {
        FManger.write(Coach.get(0).getCoachData(), CoachFileName, false);
        for (int i = 1; i < Coach.size(); i++) {
            FManger.write(Coach.get(i).getCoachData(),CoachFileName, true);
        }
      }
//mamdouh mashaal id:201900845
      public int getCoachIndex(int id){
        for (int i = 0; i < Coach.size(); i++)
            if(Coach.get(i).getID() == id)
                return i;
        
        return -1;
    }
    
    
//mamdouh mashaal id:201900845
    public String displayAllCoaches() {
        loadFromFile();
        String S = "\nAll Coaches Data:\n";
        for (Coaches x :Coach) {
            S = S + x.toString();
        }
        return S;
    }
    //mamdouh mashaal id:201900845
    public String searchCoach(int id){
        loadFromFile();
        int index = getCoachIndex(id);
        if(index != -1)
            return "\nFound ...!" +Coach.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
    //mamdouh mashaal id:201900845
    public void updateCoach(int oldID, Coaches x){
        loadFromFile();
        int index = getCoachIndex(oldID);
        Coach.set(index, x);
        commitToFile();
    } 
    //mamdouh mashaal id:201900845
    public void deleteCoach(int id){
        loadFromFile();
        int index = getCoachIndex(id);
       Coach.remove(index);
        commitToFile();
    }
    //mostafa mohsen , id:201900827
    public void addNewSchedule(int id,String day, String workoutname, int noOfDays)
    {
        Schedule x = new Schedule(id,day,workoutname,noOfDays);
        if (x.addSchedule()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
     
     
     
    @Override
    //mamdouh mashaal id:201900845
    public String toString() {
     return "\n coach " + name +  "\n" + "ID : " + id +  "\nUserName: " + userName + "\t Password: " + pass + "\n"+    "\n";
     
    }
    public String toStringForAssigning(){
        //Yousef Abubakr  , id: 201900974
             return "\n coach: " + name +  "\n" + "ID : " + id + "\n";

    }
    
  
    
}
