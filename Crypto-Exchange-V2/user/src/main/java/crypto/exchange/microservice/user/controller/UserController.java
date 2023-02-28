package crypto.exchange.microservice.user.controller;

import crypto.exchange.microservice.user.dto.UserWalletDTO;
import crypto.exchange.microservice.user.entity.User;
import crypto.exchange.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public void create(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/userWithWallet/{userId}")
    public UserWalletDTO getUserWithWallet(@PathVariable Long userId) {
        return userService.getUserWithWallet(userId);
    }
}
