package spring.intro.service.impl;

import org.springframework.stereotype.Component;
import spring.intro.dto.UserResponceDto;
import spring.intro.model.User;
import spring.intro.service.UserService;

@Component
public class UserMapper {
    private final UserService userService;

    public UserMapper(UserService userService) {
        this.userService = userService;
    }

    public UserResponceDto getUserDto(User user) {
        UserResponceDto userResponceDto = new UserResponceDto();
        userResponceDto.setId(user.getId());
        userResponceDto.setFirstName(user.getFirstName());
        userResponceDto.setEmail(user.getEmail());
        return userResponceDto;
    }

}
