package org.jtf.k8s.order.management.controller;

import org.jtf.k8s.order.management.entity.Order;
import org.jtf.k8s.order.management.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public String listOrders(Model model) {
        model.addAttribute("orders", orderRepository.findAll());
        return "order/list";
    }

    @GetMapping("/orders/new")
    public String newOrderForm(Model model) {
        model.addAttribute("order", new Order());
        return "order/new";
    }

    @PostMapping("/orders")
    public String saveOrder(Order order) {
        orderRepository.save(order);
        return "redirect:/orders";
    }
}
