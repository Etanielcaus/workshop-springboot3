package udemy.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.course.course.entities.Category;
import udemy.course.course.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
