package DevOps_Project.DevOps_Project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Optional: adding a common prefix for your API endpoints
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

   
}
