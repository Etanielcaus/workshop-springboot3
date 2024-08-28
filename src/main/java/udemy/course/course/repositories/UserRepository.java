package udemy.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.course.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
