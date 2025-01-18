package O.WithPrinciple;

public class ExcelPrinter implements InvoicePrinter {

    Invoice invoice;

    public ExcelPrinter(){
        invoice = new Invoice();
    }


    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("Print the Invoice in the excel form");
    }
}
