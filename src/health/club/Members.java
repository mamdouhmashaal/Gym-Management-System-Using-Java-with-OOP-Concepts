
package health.club;

import java.util.ArrayList;


public class Members extends Person {
   
    
    private final String memberFileName = "members.txt";
    
    public static ArrayList<Members> Member = new ArrayList<Members>();
    public Members(){
    }
    public Members(int id,String userName, String name , int pass){
           super( id, userName, name, pass);
    }
    
   //mamdouh mashaal id:201900845
     public boolean addmember() {
        if (FManger.write(getMemberData(), memberFileName, true)) {
            return true;
        } else {
            return false;
        }
        
    }//mamdouh mashaal id:201900845
         private String getMemberData(){
        return this.id + "@" + this.userName + "@" + this.name + "@" + this.pass + "@";
    }
         public String Getmemberdata(){
             
           return  this.id + "@" + this.name + "@";  
         }
//mamdouh mashaal id:201900845
      private void commitToFile() {
        FManger.write(Member.get(0).getMemberData(), memberFileName, false);
        for (int i = 1; i < Member.size(); i++) {
            FManger.write(Member.get(i).getMemberData(), memberFileName, true);
        }
      }
//mamdouh mashaal id:201900845
    public int getMemberIndex(int id){
        for (int i = 0; i < Member.size(); i++)
            if(Member.get(i).getID() == id)
                return i;
        
        return -1;
    } 
    //mamdouh mashaal id:201900845
    void loadFromFile() {
            Member = (ArrayList<Members>) (Object) FManger.read(memberFileName);
    }
//mamdouh mashaal id:201900845
    public String ListAllMembers() {
        loadFromFile();
        String S = "\nAll Members Data:\n";
        for (Members x : Member) {
            S = S + x.toString();
        }
        return S;
    }
    //mamdouh mashaal id:201900845
    public String searchMember(int id){
        loadFromFile();
        int index = getMemberIndex(id);
        if(index != -1)
            return "\nFound ...!" + Member.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
    //mamdouh mashaal id:201900845
    public void updateMember(int oldID, Members x){
        loadFromFile();
        int index = getMemberIndex(oldID);
        Member.set(index, x);
        commitToFile();
    } 
    //mamdouh mashaal id:201900845
    public void deleteMember(int id){
        loadFromFile();
        int index = getMemberIndex(id);
        Member.remove(index);
        commitToFile();
    }
    //Yousef Abubakr , id;201900974
    public String ShowAssignedMembers(int id){
    AssignMembersToCoaches AssignMemberToCoach = new AssignMembersToCoaches();
     AssignMemberToCoach.loadAssignedMembers();
     int index = AssignMemberToCoach.GetIndex(id);
        return   AssignMembersToCoaches.AssignMemberToCoach.get(index).toString() ;   
    }
    //mostafa karam  , id:201900825
    public void searchForSchedule(int id) {
        Schedule x = new Schedule();
        System.out.println(x.searchSchedule(id));
    }

      //youssef ahmed id:201900976
     public void SendNotification (int id ){
          reports x = new reports();
        System.out.println(x.SubsNotify(id));  
     }
     
    @Override
    //mamdouh mashaal id:201900845
    public String toString() {
     return "\n member: " + name +  "\n" + "ID : " + id +  "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }
    public String toStringForAssigning(){
        //Yousef Abubakr , id;201900974
             return "\n member: " + name +  "\n" + "ID : " + id + "\n";

    }

   
    
}
