package ac.kr.tukorea.busapplication.controller;

import ac.kr.tukorea.busapplication.DTO.RouteStopDTO;
import ac.kr.tukorea.busapplication.service.RouteStopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class RouteStopController {
    private final RouteStopService routeStopService;

    @Autowired
    public RouteStopController(RouteStopService routeStopService) {
        this.routeStopService = routeStopService;
    }

    @GetMapping(value = "route_stop")
    public List<RouteStopDTO> getRouteStop(@RequestParam int route_id){
        return routeStopService.getRouteStop(route_id);
    }
}
