package crypto.exchange.microservice.wallet.controller;

import crypto.exchange.microservice.wallet.dto.request.CreateWalletDTO;
import crypto.exchange.microservice.wallet.dto.response.WalletDTO;
import crypto.exchange.microservice.wallet.entity.Wallet;
import crypto.exchange.microservice.wallet.enums.CryptoCurrencyType;
import crypto.exchange.microservice.wallet.enums.FiatCurrencyType;
import crypto.exchange.microservice.wallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1/wallet")
public class WalletController {
    @Autowired
    private WalletService walletService;

    @PostMapping("/")
    ResponseEntity<WalletDTO> saveWallet(@RequestBody CreateWalletDTO wallet){
        return new ResponseEntity<>(walletService.saveWallet(wallet), HttpStatus.CREATED);
    }

    /*@GetMapping("/{walletId}")
    public Wallet getWalletById(@PathVariable Long walletId) {return  walletService.getById(walletId);}

    @GetMapping("/all")
    public List<Wallet> getAllWallets() {return walletService.getAllWallets();}

    @DeleteMapping("/{walletId}")
    public void delete(@PathVariable Long walletId) {
        walletService.deleteWallet(walletId);
    }

    @PatchMapping("/addCurrency/to/{walletId}/type/{fiat}")
    public void addCurrency(@PathVariable Long walletId, @PathVariable HashMap<FiatCurrencyType, Long> fiat) {
        walletService.addCurrency(walletId, fiat);
    }

    @PatchMapping("/addCrypto/to/{walletId}/type/{crypto}")
    public void addCrypto(@PathVariable Long walletId, @PathVariable HashMap<CryptoCurrencyType, Long> crypto) {
        walletService.addCrypto(walletId, crypto);
    }

    @PatchMapping("/send-crypto-to-user/from/{myWalletId}/to/{receiverWalletId}/amount/{crypto}")
    public void sendCryptoToUser(Long receiverWalletId, Long myWalletId, HashMap<CryptoCurrencyType, Long> crypto) {
        walletService.sendCryptoToUser(receiverWalletId, myWalletId, crypto);
    }*/
}
