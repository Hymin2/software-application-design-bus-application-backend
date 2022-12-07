package ac.kr.tukorea.busapplication.repository;


import ac.kr.tukorea.busapplication.DTO.BusDTO;
import ac.kr.tukorea.busapplication.entity.BusEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<BusEntity, Long> {
    @Query(value = "select * from bus_table b inner join route_table r on b.route_id = r.id where r.id = :routeid", nativeQuery = true)
    List<BusDTO> findAllByRoute(int routeid);

    @Query(value = "select * from bus_table b where b.route_id = :routeid and b.bus_id = :busid limit 1", nativeQuery = true)
    BusDTO findByRoute_idAndBus_id(int routeid, String busid);

    @Query(value = "select new ac.kr.tukorea.busapplication.DTO.BusDTO(b.id, b.route_id, b.bus_id, b.init_order, b.gps_x, b.gps_y, b.current_stop)" +
            " from Bus b where b.route_id = :routeid and b.current_stop < :stop_order order by b.current_stop desc")
    List<BusDTO> findTop1ByRoute_idAndAndCurrent_stop(int routeid, int stop_order);
}
