package this_is_java.ch13.generic_class;

public class GenericExample {
    public static void main(String[] args) {
        Product<TV, String> product1 = new Product<>();
        product1.setKind(new TV());
        product1.setModel("스마트 TV");

        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
