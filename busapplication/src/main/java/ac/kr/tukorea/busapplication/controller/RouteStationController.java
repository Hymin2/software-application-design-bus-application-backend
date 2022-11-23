package ac.kr.tukorea.busapplication.controller;

import ac.kr.tukorea.busapplication.DTO.RouteStationDTO;
import ac.kr.tukorea.busapplication.service.RouteStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/station")
public class RouteStationController {
    private final RouteStationService routeStationService;

    @Autowired
    public RouteStationController(RouteStationService routeStationService) {
        this.routeStationService = routeStationService;
    }

    @GetMapping(value = "/routeid")
    public List<RouteStationDTO> getRouteStation(@RequestParam String number){
        return routeStationService.getRoute(number);
    }
}
