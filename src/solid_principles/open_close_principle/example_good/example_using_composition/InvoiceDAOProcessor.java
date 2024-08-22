package solid_principles.open_close_principle.example_good.example_using_composition;

import solid_principles.open_close_principle.Invoice;
import solid_principles.open_close_principle.example_good.InvoiceDAO;

public class InvoiceDAOProcessor {
    private InvoiceDAO invoiceDAO;
    public InvoiceDAOProcessor(InvoiceDAO invoiceDAO){
        this.invoiceDAO = invoiceDAO;
    }
    public void saveData(){
        invoiceDAO.save();
    }
}
