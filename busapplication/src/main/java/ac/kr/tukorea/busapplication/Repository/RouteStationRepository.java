package ac.kr.tukorea.busapplication.repository;

import ac.kr.tukorea.busapplication.DTO.RouteStationDTO;
import ac.kr.tukorea.busapplication.entitry.RouteStationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteStationRepository extends JpaRepository<RouteStationEntity, Long> {

    @Query(value =
            "select new ac.kr.tukorea.busapplication.DTO.RouteStationDTO(rs.station_order, s.id, s.name, s.number, s.gps_x, s.gps_y, s.city_name) " +
            "from Station s " +
            "inner join RouteStation rs on rs.station.id = s.id " +
            "where rs.route.id = :routeid")
    List<RouteStationDTO> findStationByRoute_Id(@Param("routeid") String routeid);

}