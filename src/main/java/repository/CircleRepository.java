package repository;

import model.Circle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("circleRepository")
public interface CircleRepository extends JpaRepository <Circle,Long> {
    Circle findAllById(int id);


}
