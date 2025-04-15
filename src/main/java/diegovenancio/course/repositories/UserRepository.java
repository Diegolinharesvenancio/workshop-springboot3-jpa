package diegovenancio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegovenancio.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
