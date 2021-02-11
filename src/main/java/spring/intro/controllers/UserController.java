package spring.intro.controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.intro.dto.UserResponceDto;
import spring.intro.model.User;
import spring.intro.service.UserService;
import spring.intro.service.impl.UserMapper;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/inject")
    public void save() {
        userService.add(new User("Bob", "bob@i.ua"));
        userService.add(new User("Camila", "cam@i.ua"));
        userService.add(new User("Diana", "diana@i.ua"));
        userService.add(new User("Ed", "ed@i.ua"));
    }

    @GetMapping("/{id}")
    public UserResponceDto getUserById(@PathVariable("id") Long id) {
        return userMapper.getUserDto(userService.getUser(id));
    }

    @GetMapping
    public List<UserResponceDto> getAll() {
        return userService.listUsers()
                .stream()
                .map(userMapper::getUserDto)
                .collect(Collectors.toList());
    }
}
