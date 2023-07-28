      

    

package health.club;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


class FileManger {//mamdouh mashaal id:201900845
    public boolean write(String Query, String FilePath, boolean appendType) {

        PrintWriter writter = null;
        try {
            System.out.print("\nwritting in ! " + FilePath);

            writter = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writter.println(Query);

            System.out.println(" ... Done ! ");
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            writter.close();
        }
        return false;
    }

    public ArrayList<Object> read(String FilePath) {
       // Scanner input = new Scanner(System.in);
        
        Scanner Reader = null;
        try {
            System.out.println("Reading ! From " + FilePath);

            Reader = new Scanner(new File(FilePath));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        //mamdouh mashaal id:201900845
        if (FilePath.equals("members.txt")) {

            ArrayList<Members> Member = new ArrayList<Members>();
            Members x;

            while (Reader.hasNext()) {

                x = new Members();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                // 20140011@Ahmed@Ali@20@
                x.setID(Integer.parseInt(seprated[0]));
                x.setName(seprated[1]);
                x.setUserName(seprated[2]);
                x.setPass(Integer.parseInt(seprated[3]));
    

                Member.add(x);
            }

            return (ArrayList<Object>) (Object)Member;
            
            
            
            
            

        
            //mamdouh mashaal id:201900845
        } else if (FilePath.equals("coach.txt")) {

            ArrayList<Coaches> Coach = new ArrayList<>();
            Coaches x;

            while (Reader.hasNext()) {

                x = new Coaches();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                // 1@Shaima@Ali@35@3500.0@SA@SA_1@12345678@
                x.setID(Integer.parseInt(seprated[0]));
                x.setName(seprated[1]);
                x.setUserName(seprated[2]);
                x.setPass(Integer.parseInt(seprated[3]));
     
               Coach.add(x);
            }

            return (ArrayList<Object>) (Object) Coach;
                
        } else if (FilePath.equals("MembersToCoaches.txt")) {
            //Yousef Abubakr  , ID:201900974
            ArrayList<AssignMembersToCoaches> AssignMemberToCoach = new ArrayList<>();
            AssignMembersToCoaches member,coach;

            while (Reader.hasNext()) {

                member = new AssignMembersToCoaches();
                coach = new AssignMembersToCoaches();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                member.setID(Integer.parseInt(seprated[0]));
                member.setName(seprated[1]);
                coach.setID(Integer.parseInt(seprated[2]));
                coach.setName(seprated[3]);
    

                AssignMemberToCoach.add(member);
                AssignMemberToCoach.add(coach);

            }

            return (ArrayList<Object>) (Object)AssignMemberToCoach;}
        else if (FilePath.equals("bills.txt")) {
            //mamdouh mashaal id:201900845

            ArrayList<Bill> Bill = new ArrayList<>();
            Bill x;

            while (Reader.hasNext()) {

                x = new Bill();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                
                x.setmemberId(Integer.parseInt(seprated[0]));
                x.setTotal(Double.parseDouble(seprated[1]));
               
     
              Bill.add(x);
            }

            return (ArrayList<Object>) (Object) Bill;
        }
        
        
         else if (FilePath.equals("reports.txt")){
         ArrayList<reports> reports = new ArrayList<>();
            reports x;

            while (Reader.hasNext()) {

                x = new reports();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                
                x.SetMemberId(Integer.parseInt(seprated[0]));
                
                x.SetMemberAge(Integer.parseInt(seprated[1]));
                x.SetMemberName(seprated[2]);
                x.SetMemberSubsM (Integer.parseInt(seprated[3]));
     
               reports.add(x);
            }

            return (ArrayList<Object>) (Object) reports;
        }
          else if (FilePath.equals("Schedule.txt")){
         ArrayList<Schedule> Schedule = new ArrayList<>();
            Schedule x;

            while (Reader.hasNext()) {

                x = new Schedule();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                x.setID(Integer.parseInt(seprated[0]));
                x.setDay(seprated[1]);
               x.setWorkout_name(seprated[2]);
                x.setNo_of_days(Integer.parseInt(seprated[3]));
                
     
               Schedule.add(x);
            }

            return (ArrayList<Object>) (Object) Schedule;
        }
            
            else{
            return null;
            }
        
    }
}