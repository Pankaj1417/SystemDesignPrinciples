package solid_principles.interface_segmaentd_principle.exaple_bad;

public class Cook implements RestaurantEmployee{
    @Override
    public void cook() {
        // i can cook
    }

    @Override
    public void clean() {
        // i can clean kitchen
    }

    @Override
    public void serve() {
        //not my work
    }

    @Override
    public void setMenu() {
        // i can set menu
    }
}
