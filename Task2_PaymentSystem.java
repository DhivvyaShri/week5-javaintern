interface Payment {

    void pay(double amount);

    void showPaymentDetails();
}

class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount +
                " completed using UPI.");
    }

    public void showPaymentDetails() {
        System.out.println("Payment Method: UPI");
        System.out.println("Transaction Status: Successful");
    }
}

class CardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount +
                " completed using Card.");
    }

    public void showPaymentDetails() {
        System.out.println("Payment Method: Debit Card");
        System.out.println("Transaction Status: Successful");
    }
}

public class Task2_PaymentSystem {

    public static void main(String[] args) {

        Payment upi = new UPIPayment();
        Payment card = new CardPayment();

        System.out.println("UPI Payment");
        upi.pay(1500);
        upi.showPaymentDetails();

        System.out.println("\nCard Payment");
        card.pay(2500);
        card.showPaymentDetails();
    }
}