package ac.kr.tukorea.busapplication.service;

import ac.kr.tukorea.busapplication.DTO.RouteStationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.kr.tukorea.busapplication.repository.RouteStationRepository;

import java.util.List;

@Service
public class RouteStationService {
    private final RouteStationRepository routeStationRepository;

    @Autowired
    public RouteStationService(RouteStationRepository routeStationRepository) {
        this.routeStationRepository = routeStationRepository;
    }

    public List<RouteStationDTO> getRoute(String number){
        return routeStationRepository.findStationByRoute_Id(number);
    }
}
