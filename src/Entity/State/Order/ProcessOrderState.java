package Entity.State.Order;

public class ProcessOrderState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Order is in Process State.");
        context.setState(new DeliveredOrderState());
    }
}
