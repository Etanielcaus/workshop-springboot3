package udemy.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.course.course.entities.OrderItem;
import udemy.course.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
