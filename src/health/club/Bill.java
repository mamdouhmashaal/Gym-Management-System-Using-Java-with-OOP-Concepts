
package health.club;
import java.util.ArrayList;


public class Bill {//mamdouh mashaal id:201900845
        private final String billFileName = "bills.txt";
    
    public static ArrayList<Bill> Bill = new ArrayList<Bill>();
        private int memberId;
        private double total;
      FileManger FManger = new FileManger();
        
        public Bill(){
            
        }
        //mamdouh mashaal id:201900845
        public Bill(int memberId,double total){
            this.memberId=memberId;
            this.total=total;
        }
        //mamdouh mashaal id:201900845
        public void setmemberId(int memberId) {
        this.memberId = memberId;
    }
        //mamdouh mashaal id:201900845
         public void setTotal(double total) {
        this.total= total;
    }//mamdouh mashaal id:201900845
        public int getmemberId() {
        return this.memberId;
    }//mamdouh mashaal id:201900845
        public double getTotal() {
        return this.total;
    }//mamdouh mashaal id:201900845
        private String getBillData(){
        return this.memberId + "@" + this.total + "@";
    }
        //mamdouh mashaal id:201900845
      public void loadFromFile() {
           Bill = (ArrayList<Bill>) (Object) FManger.read(billFileName);
    }
      //mamdouh mashaal id:201900845
       public boolean addBill() {
        if (FManger.write(getBillData(),billFileName, true)) {
            return true;
        } else {
            return false;
        }
        
        
    }//mamdouh mashaal id:201900845
     public String ListAllBills() {
        loadFromFile();
        String S = "\nAll Bills Data:\n";
        for (Bill x : Bill) {
            S = S + x.toString();
        }
        return S;
     }//mamdouh mashaal id:201900845
     private void commitToFile() {
        FManger.write(Bill.get(0).getBillData(), billFileName, false);
        for (int i = 1; i < Bill.size(); i++) {
            FManger.write(Bill.get(i).getBillData(),billFileName, true);
        }
     }
//mamdouh mashaal id:201900845
      private int getBillIndex(int id){
        for (int i = 0; i < Bill.size(); i++)
            if(Bill.get(i).getmemberId() == id)
                return i;
        
        return -1;
    }
      //mamdouh mashaal id:201900845
      public String displayAllBills() {
        loadFromFile();
        String S = "\nAll Bills Data:\n";
        for (Bill x :Bill) {
            S = S + x.toString();
        }
        return S;
    }
    //mamdouh mashaal id:201900845
    public String searchBill(int id){
        loadFromFile();
        int index = getBillIndex(id);
        if(index != -1)
            return "\nFound ...!" +Bill.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
    //mamdouh mashaal id:201900845
    public void updateBill(int oldID, Bill x){
        loadFromFile();
        int index = getBillIndex(oldID);
        Bill.set(index, x);
        commitToFile();
    } 
    //mamdouh mashaal id:201900845
    public void deleteBill(int id){
        loadFromFile();
        int index = getBillIndex(id);
       Bill.remove(index);
        commitToFile();
    }

    
    @Override
    
    public String toString() {
     return "\n Member id:  " + memberId +  "\n" + "Total paid  : " + total +      "\n";
     
    }

    
  
}
