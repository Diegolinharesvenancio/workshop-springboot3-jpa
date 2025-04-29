package diegovenancio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegovenancio.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
