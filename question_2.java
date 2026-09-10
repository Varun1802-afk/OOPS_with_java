class BankAccount{
    private int accountNumber;
    private int balance;

    void setAccountNumber(int a){
        this.accountNumber = a;
    }
    void getAccountNumber(){
        System.out.println("AccountNumber: "+ accountNumber);
    }

    void setAmount(int a){
        if(a>0){
            this.balance = a;
            System.out.println("Balance updated");
        }else{
            System.out.println("Invalid balance");
        }
    }
    void getAmount(){
        System.out.println("Balance : "+this.balance);
    }
}


public class question_2 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setAccountNumber(101010);
        obj.getAccountNumber();
        obj.setAmount(-1000);
        obj.setAmount(2000);
        obj.getAmount();
    }
    
    
}
