package ac.kr.tukorea.busapplication.repository;

import ac.kr.tukorea.busapplication.DTO.RouteDTO;
import ac.kr.tukorea.busapplication.entity.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, Integer> {

    @Query(value = "select " +
            "new ac.kr.tukorea.busapplication.DTO.RouteDTO" +
            "(r.id, r.name, r.st_sta_sm, r.ed_sta_nm, r.up_first_time, r.up_last_time, r.peek_alloc, r.npeek_alloc, r.region_name) " +
            "from Route r where r.name like :name%")
    List<RouteDTO> findByNameStartsWith(@Param("name") String name);
}
