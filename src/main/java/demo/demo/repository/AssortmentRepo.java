package demo.demo.repository;

import demo.demo.entity.Assortment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssortmentRepo extends JpaRepository<Assortment, Long> {
}
