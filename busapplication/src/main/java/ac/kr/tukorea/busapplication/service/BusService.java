package ac.kr.tukorea.busapplication.service;


import ac.kr.tukorea.busapplication.DTO.BusDTO;
import ac.kr.tukorea.busapplication.entity.BusEntity;
import ac.kr.tukorea.busapplication.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Column;
import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;


    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }


    public List<BusDTO> getBus(String routeid){
        return busRepository.findAllByRoute(routeid);
    }

    public BusEntity saveBus(BusDTO busDTO){
        BusEntity busEntity = new BusEntity(0, busDTO.getRoute_id(), busDTO.getBus_id(), busDTO.getInit_order(), busDTO.getGps_x(), busDTO.getGps_y(), busDTO.getCurrent_stop());

        return busRepository.save(busEntity);
    }

}
