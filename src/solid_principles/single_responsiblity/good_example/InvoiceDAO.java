package solid_principles.single_responsiblity.good_example;

public class InvoiceDAO {
    private Invoice invoice;
    public InvoiceDAO(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        // logic to save invoice
    }
}
