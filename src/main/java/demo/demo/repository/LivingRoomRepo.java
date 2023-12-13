package demo.demo.repository;

import demo.demo.entity.LivingRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivingRoomRepo extends JpaRepository<LivingRoom, Long> {
}
