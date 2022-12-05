package ac.kr.tukorea.busapplication.repository;


import ac.kr.tukorea.busapplication.DTO.BusDTO;
import ac.kr.tukorea.busapplication.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<BusEntity, Long> {
    @Query(value = "select * from bus_table b inner join route_table r on b.route_id = r.id where r.id = :routeid", nativeQuery = true)
    List<BusDTO> findAllByRoute(String routeid);
}
