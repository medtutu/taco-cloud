package tutu.tacocloud.data;

import tutu.tacocloud.Order;
import tutu.tacocloud.Taco;

public interface OrderRepository {

    Order save(Order order);
}
