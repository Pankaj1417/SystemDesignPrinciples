package solid_principles.open_close_principle.example_good;

public class Main {
    public static void main(String[] args) {
        // inheritance -> tightly coupled.
        InvoiceDAO invoiceDAO = new DatabaseInvoiceDAO();
        invoiceDAO.save();
    }
}
