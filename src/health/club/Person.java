
package health.club;
//mamdouh mashaal id:201900845

public abstract class Person {
   protected int id;
   protected String userName;
 
   protected String name;

   protected int pass;
  
   
    FileManger FManger = new FileManger();

    public Person() {
    }

    public Person(int id,String userName, String name,int pass  ) {
             
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.pass = pass;
        
   
    }

    @Override
    public abstract String toString();

    //setter
    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

     
    
    //getter
    public String getuserName() {
        return this.userName;
    }

    public int getPass() {
        return this.pass;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    

   


   
    
     public boolean memberlogin(String userName, String Pass) {
        if (userName.equals("member") && Pass.equals("123")) {
            return true;
        }
        return false;
    }
      public boolean coachlogin(String userName, String Pass) {
        if (userName.equals("coach") && Pass.equals("123")) {
            return true;
        }
        return false;
    }
    
    
}
