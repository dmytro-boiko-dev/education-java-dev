import com.dao.UserDAO;
import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserSystemTest {
    public static void main(String[] args) {
//        UserService userService = new UserService();
//        List allUsers = userService.getAllUsers();
//        System.out.println(allUsers);

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-application.xml");
        UserDAO userRepo = context.getBean("userRepo23", UserDAO.class);
        System.out.println(userRepo.getAllUsers());

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.hashCode());
        System.out.println(userService.getAllUsers());
    }
}