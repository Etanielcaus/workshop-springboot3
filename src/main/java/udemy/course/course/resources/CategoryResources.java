package udemy.course.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udemy.course.course.entities.Category;
import udemy.course.course.entities.Order;
import udemy.course.course.services.CategoryService;
import udemy.course.course.services.OrderService;

import java.util.List;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryResources {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
