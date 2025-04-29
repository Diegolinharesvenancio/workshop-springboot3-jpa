package diegovenancio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegovenancio.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
