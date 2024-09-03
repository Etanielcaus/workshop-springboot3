package udemy.course.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udemy.course.course.entities.Product;
import udemy.course.course.services.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductResources {

    @Autowired
    private ProductService userService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product byId = userService.findById(id);
        return ResponseEntity.ok().body(byId);
    }
}
