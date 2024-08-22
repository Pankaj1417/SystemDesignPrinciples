package solid_principles.interface_segmaentd_principle.exaple_bad;

public class Waiter implements RestaurantEmployee{
    @Override
    public void cook() {
        // not my responsiblity
    }

    @Override
    public void clean() {
        // i am cleaning the table
    }

    @Override
    public void serve() {
        // i can serve
    }

    @Override
    public void setMenu() {
        //not my responsiblity
    }
}
