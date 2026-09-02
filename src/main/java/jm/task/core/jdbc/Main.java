package jm.task.core.jdbc;

import java.util.List;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Мария", "Смирнова", (byte) 30);
        userService.saveUser("Иван", "Кузнецов", (byte) 24);
        userService.saveUser("Алексей", "Петров", (byte) 39);
        userService.saveUser("Ольга", "Волкова", (byte) 22);

        List<User> users = userService.getAllUsers();

        for (User user: users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
