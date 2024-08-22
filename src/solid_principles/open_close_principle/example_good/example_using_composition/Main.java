package solid_principles.open_close_principle.example_good.example_using_composition;

import solid_principles.open_close_principle.example_good.DatabaseInvoiceDAO;
import solid_principles.open_close_principle.example_good.InvoiceDAO;

public class Main {
    public static void main(String[] args) {
        //Following composition
        InvoiceDAO invoiceDAO = new DatabaseInvoiceDAO();
        InvoiceDAOProcessor invoiceDAOProcessor = new InvoiceDAOProcessor(invoiceDAO);
        invoiceDAOProcessor.saveData();
    }
}
