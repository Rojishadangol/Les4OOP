abstract class PaymentMethod {
    abstract void validate();
    abstract void processTransaction();
}

class CreditCard extends PaymentMethod {
    void validate() { System.out.println("Validating Credit Card..."); }
    void processTransaction() { System.out.println("Processing Credit Card..."); }
}

class PayPal extends PaymentMethod {
    void validate() { System.out.println("Validating PayPal..."); }
    void processTransaction() { System.out.println("Processing PayPal..."); }
}

class BankTransfer extends PaymentMethod {
    void validate() { System.out.println("Validating Bank Account..."); }
    void processTransaction() { System.out.println("Processing Bank Transfer..."); }
}

public class Payment {
    public static void main(String[] args) {
        PaymentMethod p1 = new CreditCard();
        PaymentMethod p2 = new PayPal();
        PaymentMethod p3 = new BankTransfer();

        p1.validate(); p1.processTransaction();
        p2.validate(); p2.processTransaction();
        p3.validate(); p3.processTransaction();
    }
}
