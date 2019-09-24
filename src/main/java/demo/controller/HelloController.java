package demo.controller;

import demo.model.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String print(@RequestParam(name = "name", required = false) String name) {
        return String.format("Hello, %s", name);
    }

    @GetMapping("/users")
    public List<User> users() {
        return this.userService.getUsers();
    }
}
