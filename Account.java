public class Account {

    private String name;
    private double balance;

    public Account(String name,Double balance){
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(Double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public void withDraw(Double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - withdrawAmount;
            System.out.printf(" Current Balance after withdrawal is %.2f ", this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
