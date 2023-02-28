package crypto.exchange.microservice.tradingengine.repository;

import crypto.exchange.microservice.tradingengine.entity.TradingPair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradingPairRepository extends JpaRepository<TradingPair, Long> {
    TradingPair findByFromAndTo(String currencyInput, String currencyOutput);
}
