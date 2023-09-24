package Chapter3;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice inv = new Invoice("A01", "New Bolt", -1, -23.99);

        System.out.println("Invoice details are " + inv.getPartNumber() + " " + inv.getPartDescription() + " " + inv.getItemQuantity() + " " + inv.getPricePerItem());

        inv.setPricePerItem(-2);

        double totalCost = inv.getInvoiceAmount();

        System.out.printf(" Total Cost is $%.2f", totalCost);
    }
}
