package spring.intro.service.impl;

import org.springframework.stereotype.Component;
import spring.intro.dto.UserResponceDto;
import spring.intro.model.User;

@Component
public class UserMapper {

    public UserResponceDto getUserDto(User user) {
        UserResponceDto userResponceDto = new UserResponceDto();
        userResponceDto.setId(user.getId());
        userResponceDto.setFirstName(user.getFirstName());
        userResponceDto.setEmail(user.getEmail());
        return userResponceDto;
    }
}
