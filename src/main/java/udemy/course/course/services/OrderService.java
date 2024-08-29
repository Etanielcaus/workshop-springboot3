package udemy.course.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udemy.course.course.entities.Order;
import udemy.course.course.entities.User;
import udemy.course.course.repositories.OrderRepository;
import udemy.course.course.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> byId = orderRepository.findById(id);
            return byId.get();
    }
}
