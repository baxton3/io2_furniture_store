package demo.demo.repository;

import demo.demo.entity.Bedroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BedroomRepo extends JpaRepository<Bedroom, Long> {
}
