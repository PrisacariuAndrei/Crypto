package crypto.exchange.microservice.user.dto;

import crypto.exchange.microservice.user.entity.User;
import lombok.Data;

@Data
public class UserWalletDTO {
    private User user;
    private Wallet wallet;
}
