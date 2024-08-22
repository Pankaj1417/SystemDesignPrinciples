package solid_principles.interface_segmaentd_principle.exaple_good;

public class Cook implements RestaurantCook{
    @Override
    public void cook() {
        // i can cook
    }

    @Override
    public void cleanKitchen() {
        // i can clean kitchen
    }

    @Override
    public void setMenu() {
        // i can set menu
    }
}
