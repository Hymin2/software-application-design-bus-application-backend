package ac.kr.tukorea.busapplication.controller;

import ac.kr.tukorea.busapplication.DTO.StopDTO;
import ac.kr.tukorea.busapplication.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class StopController {
    private final StopService stopService;

    @Autowired
    public StopController(StopService stopService) {
        this.stopService = stopService;
    }

    @GetMapping(value = "stop")
    public List<StopDTO> getStop(@RequestParam String name){
        return stopService.getStop(name);
    }
}