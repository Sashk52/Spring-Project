package spring.intro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.intro.dto.UserResponceDto;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello123";
    }

    @GetMapping("/userDto")
    public UserResponceDto getUser() {
        UserResponceDto dto = new UserResponceDto();
        dto.setFirstName("Bob");
        dto.setEmail("bob@i.ua");
        return dto;
    }
}
