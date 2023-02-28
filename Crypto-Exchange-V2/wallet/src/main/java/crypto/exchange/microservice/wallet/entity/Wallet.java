package crypto.exchange.microservice.wallet.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@Table(name=Wallet.TABLE_NAME)
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {

    public static final String TABLE_NAME = "t_wallet";
    @Id
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private int cryptoAmount;

    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Fiat> money;



}
