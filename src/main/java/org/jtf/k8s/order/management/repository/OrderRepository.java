package org.jtf.k8s.order.management.repository;

import org.jtf.k8s.order.management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

