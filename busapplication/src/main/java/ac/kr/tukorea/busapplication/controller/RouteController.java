package ac.kr.tukorea.busapplication.controller;

import ac.kr.tukorea.busapplication.entitry.RouteEntity;
import ac.kr.tukorea.busapplication.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/route")
public class RouteController {

    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping(value = "/busnum")
    public List<RouteEntity> getRoute(@RequestParam String number){
        return routeService.getRoute(number);
    }
}
