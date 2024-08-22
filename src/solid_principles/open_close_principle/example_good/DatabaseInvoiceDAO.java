package solid_principles.open_close_principle.example_good;

public class DatabaseInvoiceDAO implements InvoiceDAO{
    @Override
    public void save() {
        //save to database
    }
}
