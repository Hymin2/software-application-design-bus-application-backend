package ac.kr.tukorea.busapplication.service;

import ac.kr.tukorea.busapplication.DTO.RouteDTO;
import ac.kr.tukorea.busapplication.DTO.StopDTO;
import ac.kr.tukorea.busapplication.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }
    public List<RouteDTO> getRoute(String name) {
        return routeRepository.findByNameStartsWith(name);
    }
}
