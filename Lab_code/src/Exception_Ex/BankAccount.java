package Exception_Ex;

import java.util.SortedMap;

public class BankAccount {
    private String AccountNo;
    private int Balance;
    BankAccount(String a,int b){
        this.AccountNo=a;
        this.Balance=b;
    }
    String getAccountNo(){
        return this.AccountNo;
    }
    int getBalance(){
        return this.Balance;
    }
    public static void main(String[] args) {

        try {
            BankAccount BA = new BankAccount("987654", 9000);
            BA.Widhdraw(1000);
            System.out.println(BA.Balance);
            BA.Widhdraw(8001);
        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }
    }

    public void Widhdraw(int Widhdraw) throws Exception{
        if(getBalance()<Widhdraw){
            throw new Exception("Low Balance");
        }
        else{
            Balance-=Widhdraw;
        }
    }
}
