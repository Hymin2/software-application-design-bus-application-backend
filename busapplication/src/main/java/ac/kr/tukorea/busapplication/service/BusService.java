package ac.kr.tukorea.busapplication.service;


import ac.kr.tukorea.busapplication.entity.BusEntity;
import ac.kr.tukorea.busapplication.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;


    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }


    public List<BusEntity> getBus(String routeid){
        return busRepository.findAllByRoute(routeid);
    }
}
