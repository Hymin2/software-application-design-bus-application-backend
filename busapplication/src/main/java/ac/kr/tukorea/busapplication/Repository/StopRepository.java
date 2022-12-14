package ac.kr.tukorea.busapplication.repository;

import ac.kr.tukorea.busapplication.DTO.StopDTO;
import ac.kr.tukorea.busapplication.entity.StopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StopRepository extends JpaRepository<StopEntity, Integer> {
    @Query(value = "SELECT new ac.kr.tukorea.busapplication.DTO.StopDTO(s.id, s.name, s.gps_x, s.gps_y, s.region_name, s.mobile_no) FROM Stop s WHERE s.name like :name%")
    List<StopDTO> findByNameStartingWith(String name);

    @Query(value = "select new ac.kr.tukorea.busapplication.DTO.StopDTO(s.id, s.name, s.gps_x, s.gps_y, s.region_name, s.mobile_no)" +
            " from Stop s where s.id = :id")
    StopDTO findById(int id);
}
