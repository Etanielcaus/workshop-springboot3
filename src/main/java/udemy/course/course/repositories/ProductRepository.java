package udemy.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.course.course.entities.Category;
import udemy.course.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
