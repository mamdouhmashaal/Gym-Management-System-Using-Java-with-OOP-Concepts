package health.club;


// yousef abubakr    id:201900974
import static health.club.Coaches.Coach;
import static health.club.Members.Member;
import java.util.ArrayList;


public class AssignMembersToCoaches extends Person {
     public final String mtcFileName = "MembersToCoaches.txt";

     public static ArrayList<AssignMembersToCoaches> AssignMemberToCoach = new ArrayList<AssignMembersToCoaches>();
     Members member = new Members();
     Coaches coach = new Coaches();

     
     public AssignMembersToCoaches(){
     }
     
     public void Final (int id, int id1){
     
         this.id = id;
         this.id = id1;
         if(searchMembers(id)&&searchCoaches(id1)== true){
             System.out.println(toString(id, id1));
             FManger.write(AssignedMembers(id,id1), mtcFileName, true);}
         else {
             System.out.println("member or coach can't be found");}
     }

     
     private boolean searchMembers(int id){
         this.id = id;
        member.loadFromFile();
         int index = member.getMemberIndex(id);
         if (index != -1){
         return true;
         }
         else{
         return false;
         }//                    "\nNot Found ...!";
    }

   private boolean searchCoaches(int id1){
       this.id = id1;
        coach.loadFromFile();
         int index = coach.getCoachIndex(id1);
         if (index != -1){
         return true;
         }
         else{
         return false;
         }

    }
   
   private String AssignedMembers(int id,int id1){
   member.loadFromFile();
   coach.loadFromFile();
   
   int index = member.getMemberIndex(id);
   int index1 = coach.getCoachIndex(id1);
   return Member.get(index).Getmemberdata()+ Coach.get(index1).Getcoachdata();
   }

    public String toString(int id, int id1) {
       member.loadFromFile();
   coach.loadFromFile();
   
   int index = member.getMemberIndex(id);
   int index1 = coach.getCoachIndex(id1);
        return Member.get(index).toStringForAssigning()+"/t will be trained by /t"+Coach.get(index1).toStringForAssigning();
    }
            
    public void loadAssignedMembers() { /*this is the read function for the file*/
            AssignMemberToCoach = (ArrayList<AssignMembersToCoaches>) (Object) FManger.read(mtcFileName);
    }
    public int GetIndex(int id) {
    for (int i = 0; i < AssignMemberToCoach.size(); i++)
            if(AssignMemberToCoach.get(i).getID() == id)
                return i;
        
        return -1;    }
    

    @Override
    public String toString() {
        return member.toStringForAssigning() + "your coach is /n" + coach.toStringForAssigning();
    }

   

   

    

    

    

    

    


}