package O.WithPrinciple;

public class WordPrinter implements InvoicePrinter {

    Invoice invoice;

    public WordPrinter(){
        invoice = new Invoice();
    }
    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("Print the Invoice in the PDF form");
    }
}
