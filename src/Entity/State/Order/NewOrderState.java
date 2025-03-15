package Entity.State.Order;

public class NewOrderState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Order is in New State.");
        context.setState(new ProcessOrderState());
    }
}
