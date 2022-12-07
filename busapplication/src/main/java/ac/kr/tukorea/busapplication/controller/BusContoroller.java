package ac.kr.tukorea.busapplication.controller;

import ac.kr.tukorea.busapplication.DTO.BusDTO;
import ac.kr.tukorea.busapplication.DTO.BusUpdateDTO;
import ac.kr.tukorea.busapplication.entity.BusEntity;
import ac.kr.tukorea.busapplication.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class BusContoroller {
    private final BusService busService;

    @Autowired
    public BusContoroller(BusService busService) {
        this.busService = busService;
    }

    @GetMapping(value = "all_bus")
    public List<BusDTO> getAllBus(@RequestParam int routeid){
        return busService.getAllBus(routeid);
    }

    @GetMapping(value = "bus")
    public BusDTO getBus(@RequestParam int routeid, @RequestParam int stoporder){
        return busService.getBus(routeid, stoporder);
    }

    @PostMapping(value = "post_bus")
    public String saveBus(@RequestBody BusDTO busDTO){
        BusEntity busEntity = busService.saveBus(busDTO);
        String response;

        if(busEntity != null)
            response = "SUCCESS";
        else
            response = "FAILED";

        return response;
    }


    @Transactional
    @PutMapping(value = "put_bus")
    public void updateBus(@RequestBody BusUpdateDTO busUpdateDTO){
        busService.updateBus(busUpdateDTO);

    }

    @DeleteMapping(value = "delete_bus")
    public String deleteBus(@RequestParam int routeid, @RequestParam String busid){
        BusEntity busEntity = busService.deleteBus(routeid, busid);

        String response;

        if(busEntity != null)
            response = "SUCCESS";
        else
            response = "FAILED";

        return response;
    }
}