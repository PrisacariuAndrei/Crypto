package crypto.exchange.microservice.wallet.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Fiat {
    public static final String TABLE_NAME = "t_fiat";
    @Id
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "UUID")
    private String id;

    @Column(nullable = false)
    private String fiatCurrency;

    @Column(nullable = false)
    private int currencyAmount;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "wallet_id", referencedColumnName = "id")
    private Wallet wallet;
}
