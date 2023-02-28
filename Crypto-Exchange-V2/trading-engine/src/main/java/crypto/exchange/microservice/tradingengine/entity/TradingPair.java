package crypto.exchange.microservice.tradingengine.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TradingPair {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String currencyInput;

    @Column(name = "currency_to")
    private String currencyOutput;

    private BigDecimal conversionMultiplier;
    private int port;
}
