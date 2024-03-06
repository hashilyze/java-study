package this_is_java.ch13.generic_interface;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}
