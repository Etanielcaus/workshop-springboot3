package udemy.course.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udemy.course.course.entities.Product;
import udemy.course.course.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> byId = productRepository.findById(id);
            return byId.get();
    }
}
