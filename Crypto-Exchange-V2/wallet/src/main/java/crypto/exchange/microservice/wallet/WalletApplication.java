package crypto.exchange.microservice.wallet;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletApplication.class, args);


	}
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return new modelMapper;
	}
	/*@Autowired
	private WalletRepository walletRepository;
	@Override
	public void run(String... args) throws Exception {*/

		/*Wallet wallet2 = new Wallet();
		wallet2.setWalletId(2L);
		wallet2.setWalletName("Alex");
		wallet2.setCrypto(ETH, 10L);
		wallet2.setFiat(USD,5L);
		walletRepository.save(wallet2);*/
	}

