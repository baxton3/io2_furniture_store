package demo.demo.repository;

import demo.demo.entity.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepo extends JpaRepository<Kitchen, Long> {
}
