package Entity.State.Order;

public class CanceledOrderState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Order is in Canceled State.");
    }
}
