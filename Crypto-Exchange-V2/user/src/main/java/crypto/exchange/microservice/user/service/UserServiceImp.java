package crypto.exchange.microservice.user.service;

import crypto.exchange.microservice.user.dto.UserWalletDTO;
import crypto.exchange.microservice.user.dto.Wallet;
import crypto.exchange.microservice.user.entity.User;
import crypto.exchange.microservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate template;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public UserWalletDTO getUserWithWallet(Long userId) {
        UserWalletDTO userWalletDTO = new UserWalletDTO();

        User user = userRepository.findById(userId).orElse(null);
        userWalletDTO.setUser(user);

        ResponseEntity<Wallet> wallet = template.getForEntity("http://WALLET-SERVICE/wallet/" + user.getWalletId(), Wallet.class);
        userWalletDTO.setWallet(wallet.getBody());

        return userWalletDTO;
    }
}
