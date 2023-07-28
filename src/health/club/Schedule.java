
package health.club;

import java.util.ArrayList;

public class Schedule {
    //mostafa mohsen , id:201900827
    private int id;
    private String day;
    private String workout_name;
    private int no_of_days;
   //mostafa mohsen , id:201900827
    FileManger FManger = new FileManger();
    private final String ScheduleFileName = "Schedule.txt";
    
    public static ArrayList<Schedule> Schedule = new ArrayList<Schedule>();
    
    
    //mostafa mohsen , id:201900827
    public Schedule(){
        
    }
    //mostafa mohsen , id:201900827
    public Schedule(int id,String day,String workout_name,int no_of_days){
        this.id=id;
        this.day=day;
        this.no_of_days=no_of_days;
        this.workout_name=workout_name;
    }
    
    //mostafa mohsen , id:201900827
    public int getID() {
        return id;
    }
    //mostafa mohsen , id:201900827
    public String getDay() {
        return day;
    }
    //mostafa mohsen , id:201900827
    public String getWorkout_name() {
        return workout_name;
    }
    //mostafa mohsen , id:201900827
    public int getNo_of_days() {
        return no_of_days;
    }
     //mostafa mohsen , id:201900827
    public void setDay(String day) {
        this.day = day;
    }
    //mostafa mohsen , id:201900827
    public void setID(int id) {
        this.id = id;
    }
    //mostafa mohsen , id:201900827
    public void setWorkout_name(String workout_name) {
        this.workout_name = workout_name;
    }
    //mostafa mohsen , id:201900827
    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
    }
    //mostafa karam  , id:201900825 
     public void loadFromFile() {
           Schedule = (ArrayList<Schedule>) (Object) FManger.read(ScheduleFileName);
     }
     //mostafa mohsen , id:201900827
     private String getScheduleData(){
        return this.id + "@" + this.day + "@" + this.workout_name + "@" + this.no_of_days + "@" ;
    }
    
     //mostafa karam  , id:201900825
     public int getScheduleIndex(int id){
        for (int i = 0; i < Schedule.size(); i++)
            if(Schedule.get(i).getID() == id)
                return i;
        
        return -1;
    } 
     //mostafa karam  , id:201900825
     public String searchSchedule(int id){
        loadFromFile();
        int index = getScheduleIndex(id);
        if(index != -1)
            return "\nFound ...!" + Schedule.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
     //mostafa mohsen , id:201900827
      public boolean addSchedule() {
        if (FManger.write(getScheduleData(), ScheduleFileName, true)) {
            return true;
        } else {
            return false;
        }   
}
      @Override
   //mostafa mohsen , id:201900827
    public String toString() {
     return "\n Member ID: " + id +  "\n" + "Day : " +day +  "\n Workout Name: " + workout_name + "\t No of days per week : " + no_of_days + "\n";
    }
      
}
