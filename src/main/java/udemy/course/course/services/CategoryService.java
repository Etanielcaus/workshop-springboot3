package udemy.course.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udemy.course.course.entities.Category;
import udemy.course.course.entities.User;
import udemy.course.course.repositories.CategoryRepository;
import udemy.course.course.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
