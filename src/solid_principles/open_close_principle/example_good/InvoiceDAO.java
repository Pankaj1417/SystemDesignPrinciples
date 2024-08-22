package solid_principles.open_close_principle.example_good;

// OCP is followed well in this case.
public interface InvoiceDAO {
    // now if we want to add any other saving method we can simply implement this interface that will allow to add
    // new methods without modifying the source code.
    void save();
}
