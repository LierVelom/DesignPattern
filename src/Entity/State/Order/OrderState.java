package Entity.State.Order;

public interface OrderState {
    void handleOrder(OrderContext context);
}
