package solid_principles.single_responsiblity.good_example;

public class InvoiceCalculator {
    private Invoice invoice;
    public InvoiceCalculator(Invoice invoice){
        this.invoice = invoice;
    }
    public int getTotalCost(){
        int quantity = invoice.getQuantity();
        int price = invoice.getMarker().getPrice();
        return quantity*price;
    }
}
