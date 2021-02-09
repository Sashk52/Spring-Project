package spring.intro;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.intro.config.AppConfig;
import spring.intro.model.User;
import spring.intro.service.UserService;

public class Main {
    public static void main(String[] args) {

        User userBilly = new User();
        userBilly.setFirstName("Billy1");
        userBilly.setLastName("Johnson");
        userBilly.setEmail("bj");

        User userSam = new User();
        userSam.setFirstName("Sam1");
        userSam.setLastName("Smith");
        userSam.setEmail("ss");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(userBilly);
        userService.add(userSam);

        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
