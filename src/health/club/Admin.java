
package health.club;



public class Admin {
 
    private String username;
        private String password;
       
   
       public Admin() {
           
    }
         public Admin(String username,String password) {
             this.username=username;
             this.password=password;
           
    }

     
     //mamdouh mashaal id:201900845
     public void setUserName(String userName) {
        this.username = userName;
    }
      public String getuserName() {
        return this.username;
    }
      public void setPass(String pass) {
        this.password= pass;
    }
     public String getPass() {
        return this.password;
    }
     //mamdouh mashaal id:201900845
     public boolean login(String UserName, String Pass) {
        if (UserName.equals(username) && Pass.equals(password)) {
            return true;
        }
        return false;
    }
     //mamdouh mashaal id:201900845
public void addNewMember(int id,String userName, String name, int pass) {
        Members x = new Members(id, userName, name,pass);
        if (x.addmember()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
//mamdouh mashaal id:201900845
 public void ListMembers() {
       Members x = new Members();
        System.out.println(x.ListAllMembers());
    }
//mamdouh mashaal id:201900845
    public void searchForMember(int id) {
        Members x = new Members();
        System.out.println(x.searchMember(id));
    }
//mamdouh mashaal id:201900845
    public void updateMember(int oldID, Members newMemberValues) {
       Members x = new Members();
        x.updateMember(oldID, newMemberValues);
        System.out.println("Updated Successfully ... !");
    }
//mamdouh mashaal id:201900845
    public void deleteMember(int Id) {
        Members x = new Members();
        x.deleteMember(Id);
        System.out.println("deleted Successfully ... !");
    }
    
    //mamdouh mashaal id:201900845
    public void addNewCoach(int id,String userName, String name, int pass)
    {
        Coaches x = new Coaches(id, userName, name,pass);
        if (x.addCoach()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
    //mamdouh mashaal id:201900845
    public void ListCoaches() {
       Coaches x = new Coaches();
        System.out.println(x.ListAllCoaches());
    }
    //mamdouh mashaal id:201900845
    public void searchForCoaches(int id) {
        Coaches x = new Coaches();
        System.out.println(x.searchCoach(id));
    }
    //mamdouh mashaal id:201900845
    public void updateCoach(int oldID, Coaches y) {
       Coaches x = new Coaches();
        x.updateCoach(oldID, y);
        System.out.println("Updated Successfully ... !");
    }
   //mamdouh mashaal id:201900845 
    public void deleteCoach(int Id) {
        Coaches x = new Coaches();
        x.deleteCoach(Id);
        System.out.println("deleted Successfully ... !");
    }
    //mamdouh mashaal id:201900845
    public void addNewBill(int id,double total) {
        Bill x = new Bill(id,total);
        if (x.addBill()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
    //mamdouh mashaal id:201900845
    public void ListBills() {
       Bill x = new Bill();
        System.out.println(x.ListAllBills());
    }
    //mamdouh mashaal id:201900845
     public void searchForBill(int id) {
        Bill x = new Bill();
        System.out.println(x.searchBill(id));
    }
//mamdouh mashaal id:201900845
    public void updateBill(int oldID, Bill newBillValues) {
       Bill x = new Bill();
        x.updateBill(oldID, newBillValues);
        System.out.println("Updated Successfully ... !");
    }
    //mamdouh mashaal id:201900845
    public void deleteBill(int Id) {
        Bill x = new Bill();
        x.deleteBill(Id);
        System.out.println("deleted Successfully ... !");
    }
  
      public void SearchMember(int M_Id) {
       reports x = new reports();
        System.out.println(x.SearchMember(M_Id));
    }
      public void DisplayReports() {
       reports x = new reports();
        System.out.println(x.displayReports());
    }
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
    
}
