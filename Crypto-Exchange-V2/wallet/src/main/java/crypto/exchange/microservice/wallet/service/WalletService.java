package crypto.exchange.microservice.wallet.service;


import crypto.exchange.microservice.wallet.dto.request.CreateWalletDTO;
import crypto.exchange.microservice.wallet.dto.response.WalletDTO;
import crypto.exchange.microservice.wallet.entity.Wallet;
import crypto.exchange.microservice.wallet.repository.WalletRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class WalletService{

    private final WalletRepository walletRepository;
    private final ModelMapper modelMapper;

    public WalletService(WalletRepository walletRepository, ModelMapper modelMapper) {
        this.walletRepository = walletRepository;
        this.modelMapper = modelMapper;
    }

    public Wallet toWallet(CreateWalletDTO createWalletDTO) {
        return modelMapper.map(createWalletDTO, Wallet.class);
    }

    public  WalletDTO toDTO (Wallet wallet){
        return modelMapper.map(wallet, WalletDTO.class);
    }

    public WalletDTO saveWallet(CreateWalletDTO createWalletDTO ){
        Wallet savedWallet;
        savedWallet = toWallet(createWalletDTO);
        savedWallet = walletRepository.save(savedWallet);

        return toDTO(savedWallet);
    }
}
