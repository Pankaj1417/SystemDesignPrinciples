package solid_principles.interface_segmaentd_principle.exaple_good;

public class Waiter implements RestaurantWaiter{
    @Override
    public void serve() {
        // i can serve
    }

    @Override
    public void clean() {
        // i can clean
    }
}
