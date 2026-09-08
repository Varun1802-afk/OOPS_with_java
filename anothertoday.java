//WAP TO IMPLEMENT AN INTERFACE PAYMENT WITH A METHOD PAYMENT METHOD BY TWO CLASSES UPI AND CreditCard

interface PAYMENT{
    void makepayment();
}

class UpiPayment implements PAYMENT{
    @Override 
    public void makepayment(){
        System.out.println("The payment is done using UPI.");
    }
}
class CreditCard implements PAYMENT{
    @Override 
    public void makepayment(){
        System.out.println("The payment is done using CreditCard.");
    }
}

public class anothertoday {
    public static void main(String[] args) {
        PAYMENT obj = new CreditCard();
        obj.makepayment();
        PAYMENT obj1 = new UpiPayment();
        obj1.makepayment();

    }
}
