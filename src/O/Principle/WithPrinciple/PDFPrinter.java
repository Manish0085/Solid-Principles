package O.Principle.WithPrinciple;

public class PDFPrinter implements InvoicePrinter{

    Invoice invoice;

    public PDFPrinter(){
        invoice = new Invoice();
    }


    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("Print the Invoice in the PDF form");
    }

}
