package JavaProgramming1.Part4.IntrotoOOP.Paymentcard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
      this.balance=openingBalance;
    }

    public String toString() {
        return "The Card has a blance of "+ this.balance +" euros";
    }

    public void eatAffordably() {
      if(this.balance>=2.60)
          this.balance-=2.60;
    }

    public void eatHeartily() {
        if(this.balance>=4.60)
            this.balance-=4.60;
    }
    public void addMoney(double amount) {
       if(amount>=0){
        if((this.balance+amount)<150 )
           this.balance+=amount;

       else
           this.balance=150;
    }

    }
}
