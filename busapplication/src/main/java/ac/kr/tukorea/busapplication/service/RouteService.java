package ac.kr.tukorea.busapplication.service;

import ac.kr.tukorea.busapplication.entitry.RouteEntity;
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

    public List<RouteEntity> getRoute(String number){
        return routeRepository.findAllByNumberStartsWith(number);
    }
}
