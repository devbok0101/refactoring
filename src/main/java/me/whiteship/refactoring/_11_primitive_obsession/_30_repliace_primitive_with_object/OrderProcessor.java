package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class OrderProcessor {

    public long numberOfHighPriorityOrders(List<Order> orders) {
        final String priorityNormal = "normal";
        return orders.stream()
                .filter(order -> order.getPriority().higherThan(new Priority(priorityNormal)) )
                .count();
    }
}
