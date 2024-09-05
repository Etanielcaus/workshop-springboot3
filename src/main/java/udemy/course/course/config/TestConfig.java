package udemy.course.course.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import udemy.course.course.entities.*;
import udemy.course.course.enums.OrderStatus;
import udemy.course.course.repositories.*;

import java.time.Instant;
import java.util.Arrays;

@Profile("test")
@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product(null, "Crime e castigo", "livro1", 123.1, "");
        Product p2 = new Product(null, "Positivo", "ComputadorRuim", 1250.50, "");
        Product p3 = new Product(null, "Smart TV", "Tv 32", 550.5, "");
        Product p4 = new Product(null, "O capital", "livro2 Karl Marx", 50.0, "");

//        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

        Category cat1 = new Category(null, "book");
        Category cat2 = new Category(null, "computer");
        Category cat3 = new Category(null, "television");
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));


        p1.getCategories().add(cat1);
        p2.getCategories().add(cat2);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat1);
        productRepository.saveAll(Arrays.asList( p1, p2, p3, p4));

        User user1 = new User(null, "Joao Pedro", "joao@pedro", "5546650", "123");
        User user2 = new User(null, "Carlos", "carlos@pedro", "5465", "123");
        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2024-09-15T14:30:00Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2020-08-18T14:30:00Z"), OrderStatus.SHIPPED, user2);
        Order order3 = new Order(null, Instant.parse("2021-12-01T14:30:00Z"), OrderStatus.WAITING_PAYDMENT, user1);
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

        OrderItem orderItem = new OrderItem(order1, p1, 3 , p1.getPrice());
        OrderItem orderItem2 = new OrderItem(order2, p1, 3 , p1.getPrice());
        OrderItem orderItem3 = new OrderItem(order3, p4, 3 , p4.getPrice());
        OrderItem orderItem4 = new OrderItem(order1, p2, 3 , p2.getPrice());
        orderItemRepository.saveAll(Arrays.asList(orderItem, orderItem2, orderItem3, orderItem4));


    }
}
