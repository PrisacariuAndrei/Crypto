package crypto.exchange.microservice.wallet.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateWalletDTO {
    private String id;
    private String customerName;
    private int cryptoAmount;


}
