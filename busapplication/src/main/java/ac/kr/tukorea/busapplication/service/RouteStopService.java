package ac.kr.tukorea.busapplication.service;

import ac.kr.tukorea.busapplication.DTO.RouteStopDTO;
import ac.kr.tukorea.busapplication.repository.RouteStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteStopService {
    private final RouteStopRepository routeStopRepository;

    @Autowired
    public RouteStopService(RouteStopRepository routeStopRepository) {
        this.routeStopRepository = routeStopRepository;
    }

    public List<RouteStopDTO> getRouteStop(int route_id){
        return routeStopRepository.findStopIDAndStopNameAndStopOrderAndUpDownByRouteId(route_id);
    }
}
