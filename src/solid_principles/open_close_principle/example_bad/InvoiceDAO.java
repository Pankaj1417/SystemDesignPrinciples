package solid_principles.open_close_principle.example_bad;

import solid_principles.open_close_principle.Invoice;

public class InvoiceDAO {
    private Invoice invoice;
    public InvoiceDAO(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        // logic to save invoice
    }
    //OCP princiuple is violated here as we have modified the source code.
    public void saveToFile(){
        // save in text file
    }
}
