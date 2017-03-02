package mutil;

import java.io.IOException;
import java.util.List;

/**
 * Created by Synycs Solutions on 3/1/2017.
 */
public class Test {
    public static void main(String args[]) throws IOException {
   UserService userService=new UserService();
//        List<User> users=userService.getAllUsers();
//        users.forEach(System.out::println);
        User user =new User();
        user.setEmailId("sss@gmail.com");
        user.setFirstName("raja");
        user.setLastName("aa");
        user.setPassword("aaa1");
       userService.insertUser(user);
        List<User> users=userService.getAllUsers();
    users.forEach(System.out::println);
    }
}
