package Entity.State.Order;

public class DeliveredOrderState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Order is in Delivered State.");
    }
}
