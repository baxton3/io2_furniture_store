package demo.demo.repository;

import demo.demo.entity.Bathroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BathroomRepo extends JpaRepository<Bathroom, Long> {
}
