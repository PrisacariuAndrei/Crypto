package crypto.exchange.microservice.user.repository;

import crypto.exchange.microservice.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
