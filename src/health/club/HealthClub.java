    
package health.club;

import java.util.Scanner;

public class HealthClub {

   //admin login username:admin  pass:123
    //coach login username:coach pass:123
    //member login username:member pass:123 
    public static void main(String[] args) {
        Admin admin=new Admin("admin","123");
        Members member=new Members(2,"member","Member",124);
        Coaches coach =new Coaches(3,"coach","Coach",125);
        int ch=1;
        int id,pass;
        int memberBillId;  int M_Id;
        double total;
        String userName,name;
        Scanner input = new Scanner(System.in);
        String Username,Password;
        System.out.print("\n\nWelecome .....!\n\nUser Name : ");
        Username = input.next();
        System.out.print("Password  : ");
        Password=input.next();
        
       if(admin.login(Username, Password)){
            while (ch != 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t ________________________________\n\t"
                        + "| Enter 1: Add New member.     |\n\t| Enter 2: Add New Coach.   |\n\t| Enter 3: Delete a Member.          |\n\t| Enter 4: Delete a Coach.    |\n\t| Enter 5: update  memberInfo      |"
                        + "\n\t| Enter 6: update coachInfo.|\n\t| Enter 7: List All members.  |\n\t| Enter 8: List All Coaches.     |\n\t| Enter 9: Search on a member  |\n\t| Enter 10: Search on a coach .     |"
                        + "\n\t| Enter 11: Add bill for a member     |\n\t| Enter 12: Delete member bill.   |\n\t| Enter 13: Update member Bill.          |\n\t| Enter 14: List All Members Bills.    |\n\t| Enter 15: Search for member bill.      |"
                        + "\n\t| Enter 16: to make report about member.     |\n\t| Enter 17: assign member to their coaches.       |"+ "\n\t| Enter 0:to logout  -------------------------------\n\t");
                ch = input.nextInt();
                int ch1;
        switch (ch) {
                        
                    case 1://mamdouh mashaal id:201900845
                        System.out.println("Enter Member Info ... ");
                        System.out.print("Member ID : ");
                        id = input.nextInt();
                        System.out.print("Member userName : ");
                        userName = input.next();
                        System.out.print("Member Name : ");
                        name = input.next();
                        System.out.print("Member Password : \n");
                        pass = input.nextInt();
                        admin.addNewMember(id,userName,name,pass);
                        break;
                     case 2://mamdouh mashaal id:201900845
                        System.out.println("Enter Coach Info ... ");
                        System.out.print("Coach ID : ");
                        id = input.nextInt();
                        System.out.print("Coach userName : ");
                        userName = input.next();
                        System.out.print("Coach Name : ");
                        name = input.next();
                        System.out.print("Coach Password : \n");
                        pass = input.nextInt();
                        admin.addNewCoach(id,userName,name,pass);
                        break;
                     case 3://mamdouh mashaal id:201900845
                         try{
                          System.out.print("\nDelete Member info ...!\nEnter Member ID : ");
                        id = input.nextInt();
                        admin.deleteMember(id);
                         }
                         catch(RuntimeException x){
                             
                                System.out.println("Member Deleted Successfully  ");
                         }
                        break;
                        
                     case 4://mamdouh mashaal id:201900845
                         try{
                          System.out.print("\nDelete Coach info ...!\nEnter Coach ID : ");
                        id = input.nextInt();
                        admin.deleteCoach(id);
                         }
                         catch(RuntimeException x){
                             System.out.println("Coach Deleted Successfully  ");
                         }
                        break;
                     case 5://mamdouh mashaal id:201900845
                         try{
                         System.out.print("\nUpdate Member info ...!\nEnter Member ID : ");
                            id = input.nextInt();

                        System.out.println("\nEnter Member New Info ... ");
                        System.out.print("Member userName : ");
                        userName = input.next();
                        System.out.print("Member Name : ");
                        name = input.next();
                        System.out.print("Member Password : \n");
                        pass = input.nextInt();
                        Members x =new Members(id,userName,name,pass);
                        admin.updateMember(id, x);
                         }
                         catch(RuntimeException x){
                             System.out.println("Member Data Updated Sucessfully  ");
                         }
                        break;
                        
                  

                     case 6://mamdouh mashaal id:201900845
                         try{
                         System.out.print("\nUpdate Coach info ...!\nEnter Coach ID : ");
                        id = input.nextInt();

                        System.out.println("\nEnter Coach New Info ... ");
                        System.out.print("Coach userName : ");
                        userName = input.next();
                        System.out.print("Coach Name : ");
                        name = input.next();
                        System.out.print("Coach Password : \n");
                        pass = input.nextInt();
                        Coaches y =new Coaches(id,userName,name,pass);
                        admin.updateCoach(id,y);
                        
                         }
                         catch(RuntimeException x){
                             System.out.println("Coach Data Updated Successfully ");
                         }
                         break;
                     case 7://mamdouh mashaal id:201900845
                          admin.ListMembers();
                        break;
                     case 8://mamdouh mashaal id:201900845
                          admin.ListCoaches();
                        break;
                     case 9://mamdouh mashaal id:201900845
                         System.out.print("\nSearch for Member ...!\nEnter Member ID : ");
                        id = input.nextInt();
                        admin.searchForMember(id);
                        break;
                     case 10://mamdouh mashaal id:201900845
                         System.out.print("\nSearch for Coach ...!\nEnter Coach ID : ");
                        id = input.nextInt();
                        admin.searchForCoaches(id);
                        break;
                     case 11://mamdouh mashaal id:201900845
                         System.out.println("\nAdd  Bill ...!\nEnter Member Bill ID : ");
                         memberBillId = input.nextInt();
                         System.out.println("Enter The total value paid");
                         total=input.nextDouble();
                         admin.addNewBill(memberBillId,total);
                         break;
                     case 12://mamdouh mashaal id:201900845
                         try{
                         System.out.println("\nDelete   Bill ...!\nEnter Member Bill ID : ");
                         memberBillId = input.nextInt();
                         admin.deleteBill(memberBillId);
                        
                         }
                         catch(RuntimeException x){
                             System.out.println("Bill Deleted Successfully  ");
                         }
                         break;
                     case 13:  //mamdouh mashaal id:201900845
                         try{
                         System.out.println("\nUpdate  Bill ...!\nEnter Member Bill ID : ");
                         memberBillId=input.nextInt();
                         System.out.println("\nEnter Bill New Info ... ");
                        System.out.print("Total value paid : ");
                        total = input.nextDouble();
                        Bill u=new Bill(memberBillId,total);
                        admin.updateBill(memberBillId, u);
                         
                         }
                         catch(RuntimeException x){
                             System.out.println("Bill Updated Successfully  ");
                         }
                         break;
                         
                     case 14://mamdouh mashaal id:201900845
                         admin.ListBills();
                         break;
                     case 15://mamdouh mashaal id:201900845
                          System.out.print("\nSearch for Bill ...!\nEnter Member Bill ID : ");
                        memberBillId = input.nextInt();
                        admin.searchForBill(memberBillId);
                        break;
                         //youssef ahmed id:201900976
                          case 16 :
                              System.out.print("\n Choose 1 display all reports: \n Choose 2 to make report about a member:    ");
                              ch1=input.nextInt();
                              switch(ch1){
                                  case 1:
                                      admin.DisplayReports();
                                      break;
                                  case 2:
                          System.out.print("\n Enter ID to make report on  ");    
                          M_Id=input.nextInt();
                         admin.SearchMember(M_Id); 
                         break;}
                              break;
                     case 17:
                         //              Yousef Abubbakr   , id:201900974

                         AssignMembersToCoaches Assign = new AssignMembersToCoaches();
                        System.out.print("enter the id of the member\n");
                        id = input.nextInt();
                        System.out.print("enter the id of the coach\n");
                        int id1 = input.nextInt();
                        Assign.Final(id, id1);
        }
            }
         
    }
       //member switch case
       
       
       if(member.memberlogin(Username,Password)){
            while (ch != 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t ________________________________\n\t"
                        + "| Enter 1: to see end date of subscription     |\n\t| Enter 2: to see your coach  . |\n\t|  Enter 3 :to see your schedule  |\n\t| Enter 0:to logout  |"+ "\n\t|-------------------------------\n\t");
                
                ch = input.nextInt();
                
        switch (ch) {
            case 1:
                
                System.out.println("enter your id ");
                id=input.nextInt();
                member.SendNotification(id);
                break;
            case 2:
//              Yousef Abubbakr   , id:201900974
                System.out.println("enter the id of the member : /n");
                    id = input.nextInt();
                    member.ShowAssignedMembers(id);
                     
                break;
            case 3 :
                //mostafa karam  , id:201900825
                System.out.println("Enter your id : ");
                id=input.nextInt();
                member.searchForSchedule(id);
                break;
        }
           
           
           
       }
            }
       
       //coach switch case 
       
       
       if(coach.coachlogin(Username,Password)){
           while (ch != 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t ________________________________\n\t"
                        + "| Enter 1: to set schedule for your member    |\n\t| Enter 2: to send message for all your members.  |\n\t| Enter 0:to logout    |"+ "\n\t -------------------------------\n\t");
                ch = input.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter Member ID : ");
                id=input.nextInt();
                System.out.println("Enter Days(Separated by underscore)  :");
                String day=input.next();
                System.out.println("Enter Workout Names(Separated by underscore) : ");
                String workout=input.next();
                System.out.println("Enter Number of days your member will workout per week : ");
                int no_of_days=input.nextInt();
                coach.addNewSchedule(id, day, workout, no_of_days);
                break;
            case 2:
                break;
            
        }
          
       }
        
    }
    
    }
    }





