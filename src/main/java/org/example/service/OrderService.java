package org.example.service;

import org.example.model.Order;

public class OrderService {

    public double calculateDiscountedTotal(Order order) {
        double total = order.getTotal();
        if (total > 100) {
            return total * 0.9;
        }
        return total;
    }
}
