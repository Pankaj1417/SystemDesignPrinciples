package solid_principles.single_responsiblity.good_example;

import solid_principles.single_responsiblity.Marker;

public class Invoice {

    private Marker marker;
    private int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
