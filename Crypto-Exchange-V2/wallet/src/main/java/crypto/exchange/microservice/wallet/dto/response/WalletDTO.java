package crypto.exchange.microservice.wallet.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletDTO {
    private String id;
    private String customerName;
    private int cryptoAmount;


}
