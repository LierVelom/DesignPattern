package Entity.Strategy.Order;

public class DeliveredOrder implements OrderStrategy {
    public void handleOrder() {
        System.out.println("Order is in Delivered State.");
    }
}
