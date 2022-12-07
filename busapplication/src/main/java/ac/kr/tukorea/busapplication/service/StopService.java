package ac.kr.tukorea.busapplication.service;

import ac.kr.tukorea.busapplication.DTO.StopDTO;
import ac.kr.tukorea.busapplication.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopService {
    private final StopRepository stopRepository;

    @Autowired
    public StopService(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    public List<StopDTO> getStop(String name) {
        return stopRepository.findByNameStartingWith(name);
    }

    public StopDTO getStopById(int id){
        return stopRepository.findById(id);
    }
}
