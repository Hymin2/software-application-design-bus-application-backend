package ac.kr.tukorea.busapplication.repository;


import ac.kr.tukorea.busapplication.DTO.BusDTO;
import ac.kr.tukorea.busapplication.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<BusEntity, Long> {
    @Query(value = "select new ac.kr.tukorea.busapplication.DTO.BusDTO(b.bus_id, b.gps_x, b.gps_y, b.current_stop)" +
            " from Bus b inner join Route r on b.route_id = r.id where r.id = :routeid")
    List<BusDTO> findAllByRoute(int routeid);

    @Query(value = "select new ac.kr.tukorea.busapplication.DTO.BusDTO(b.id, b.route_id, b.bus_id, b.init_order, b.gps_x, b.gps_y, b.current_stop)" +
            " from Bus b where b.route_id = :routeid and b.bus_id = :busid")
    BusDTO findByRoute_idAndBus_id(int routeid, String busid);

    @Query(value = "select new ac.kr.tukorea.busapplication.DTO.BusDTO(b.bus_id, b.gps_x, b.gps_y, b.current_stop)" +
            " from Bus b where b.route_id = :routeid and b.current_stop < :stop_order order by b.current_stop desc")
    List<BusDTO> findTop1ByRoute_idAndAndCurrent_stop(int routeid, int stop_order);

    @Transactional
    @Query(value = "update Bus b set b.gps_x = :gps_x, b.gps_y = :gps_y, b.current_stop = :current_stop where b.id = :id")
    @Modifying(clearAutomatically = true)
    Integer updateById(long id, double gps_x, double gps_y, int current_stop);

}
