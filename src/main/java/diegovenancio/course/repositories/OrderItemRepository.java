package diegovenancio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegovenancio.course.entites.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
