package crypto.exchange.microservice.tradingengine.controller;

import crypto.exchange.microservice.tradingengine.entity.TradingPair;
import crypto.exchange.microservice.tradingengine.repository.TradingPairRepository;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradingController {

    @Autowired
    private Environment environment;

    @Autowired
    private TradingPairRepository repository;

    @GetMapping("/currency-exchange/from/{currencyInput}/to/{currencyOutput}")
    public TradingPair retrieveExchangeValue (@PathVariable String currencyInput, @PathVariable String currencyOutput) {

        TradingPair exchangeValue =
        repository.findByFromAndTo(currencyInput, currencyOutput);

        return exchangeValue;
    }
}
