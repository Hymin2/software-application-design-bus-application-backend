package ac.kr.tukorea.busapplication.Repository;

import ac.kr.tukorea.busapplication.entitry.RouteStationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteStationRepository extends JpaRepository<RouteStationEntity, Long> {
    List<RouteStationEntity> findAllByRoute(String route);

}
