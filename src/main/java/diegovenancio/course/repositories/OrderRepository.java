package diegovenancio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegovenancio.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
