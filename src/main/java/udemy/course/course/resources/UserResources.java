package udemy.course.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udemy.course.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "joao", "joao@joao", "99999", "123");
        return ResponseEntity.ok().body(u);
    }
}
