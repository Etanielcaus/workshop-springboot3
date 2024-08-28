package udemy.course.course.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import udemy.course.course.entities.User;
import udemy.course.course.repositories.UserRepository;

import java.util.Arrays;

@Profile("test")
@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Joao Pedro", "joao@pedro", "5546650", "123");
        User user2 = new User(null, "Carlos", "carlos@pedro", "5465", "123");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
