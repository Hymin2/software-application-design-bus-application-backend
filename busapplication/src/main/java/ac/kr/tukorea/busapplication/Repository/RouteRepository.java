package ac.kr.tukorea.busapplication.repository;

import ac.kr.tukorea.busapplication.entitry.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, String> {
    List<RouteEntity> findAllByNumberStartsWith(String number);


}
