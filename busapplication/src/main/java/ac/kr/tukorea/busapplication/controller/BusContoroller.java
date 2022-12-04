package ac.kr.tukorea.busapplication.controller;

import ac.kr.tukorea.busapplication.DTO.BusDTO;
import ac.kr.tukorea.busapplication.entity.BusEntity;
import ac.kr.tukorea.busapplication.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/bus")
public class BusContoroller {
    private final BusService busService;

    @Autowired
    public BusContoroller(BusService busService) {
        this.busService = busService;
    }

    @GetMapping(value = "allbus")
    public List<BusEntity> getBus(@RequestParam String routeid){
        return busService.getBus(routeid);
    }

//    @PostMapping(value = "post")
  //  public BusDTO addBus()


}