package crypto.exchange.microservice.user.service;

import crypto.exchange.microservice.user.dto.UserWalletDTO;
import crypto.exchange.microservice.user.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User addUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
    public void updateUser(User user);
    public UserWalletDTO getUserWithWallet(Long userId);

}
