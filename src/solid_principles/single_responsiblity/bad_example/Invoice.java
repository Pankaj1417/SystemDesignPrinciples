package solid_principles.single_responsiblity.bad_example;

import solid_principles.single_responsiblity.Marker;

//Class is having multiple reasons to change :
// change in calculation logic
// change in printing logic
// change in saving logic -> from dpb to file or any other possiblity.
public class Invoice {
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int getTotal(){
        return marker.getPrice()*quantity;
    }
    public void printInvoice(){
        // logic to print the invoice
    }
    public void saveToDB(){
        //saving logic
    }
}
