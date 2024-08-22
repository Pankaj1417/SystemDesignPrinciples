package solid_principles.single_responsiblity.good_example;

public class InvoicePrinter {
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void print(){
        // logic to print invoice
    }
}
