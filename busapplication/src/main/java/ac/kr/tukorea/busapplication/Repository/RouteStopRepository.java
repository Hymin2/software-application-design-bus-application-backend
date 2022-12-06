package ac.kr.tukorea.busapplication.repository;

import ac.kr.tukorea.busapplication.DTO.RouteStopDTO;
import ac.kr.tukorea.busapplication.entity.RouteStopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteStopRepository extends JpaRepository<RouteStopEntity, Integer> {
    @Query(value = "select new ac.kr.tukorea.busapplication.DTO.RouteStopDTO(rs.stop_id, rs.stop_name, rs.stop_order, rs.updown, s.mobile_no) from RouteStop rs inner join Stop s on s.id = rs.stop_id where rs.route_id = :route_id")
    List<RouteStopDTO> findStopIDAndStopNameAndStopOrderAndUpDownByRouteId(@Param("route_id") int route_id);

    @Query(value = "select * from route_stop_table rs where rs.route_id = :routeid and rs.stop_order = :stoporder + 1", nativeQuery = true)
    RouteStopDTO findNextStopByRoute_idAndStop_order(int routeid, int stoporder);
}
