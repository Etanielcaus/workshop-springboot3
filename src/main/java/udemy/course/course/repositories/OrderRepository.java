package udemy.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.course.course.entities.Order;
import udemy.course.course.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
