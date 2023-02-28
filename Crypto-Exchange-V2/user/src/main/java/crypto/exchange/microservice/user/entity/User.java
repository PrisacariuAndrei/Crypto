package crypto.exchange.microservice.user.entity;


import crypto.exchange.microservice.user.dto.Wallet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "Users_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long id;
    private Long walletId;
    private String password;
    private String username;
    @OneToOne
    private Wallet wallet;
}
