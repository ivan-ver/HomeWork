package repository;

import entity.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HWRepository extends JpaRepository<Component, Long> {
    @Override
    List<Component> findAll();
}
