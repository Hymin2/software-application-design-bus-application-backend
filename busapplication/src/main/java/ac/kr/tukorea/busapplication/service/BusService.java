package ac.kr.tukorea.busapplication.service;


import ac.kr.tukorea.busapplication.DTO.*;
import ac.kr.tukorea.busapplication.entity.BusEntity;
import ac.kr.tukorea.busapplication.repository.BusRepository;
import ac.kr.tukorea.busapplication.repository.StopRepository;
import ac.kr.tukorea.busapplication.repository.RouteStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;
    private final StopRepository stopRepository;
    private final RouteStopRepository routeStopRepository;
    @Autowired
    public BusService(BusRepository busRepository,
                      StopRepository stopRepository,
                      RouteStopRepository routeStopRepository) {
        this.busRepository = busRepository;
        this.stopRepository = stopRepository;
        this.routeStopRepository = routeStopRepository;
    }


    public List<BusDTO> getAllBus(int routeid){
        return busRepository.findAllByRoute(routeid);
    }

    public BusDTO getBus(int routeid, int stoporder){
        return busRepository.findTop1ByRoute_idAndAndCurrent_stop(routeid, stoporder).get(0);
    }

    public BusEntity saveBus(BusDTO busDTO){
        BusEntity busEntity = new BusEntity(0, busDTO.getRoute_id(), busDTO.getBus_id(), busDTO.getInit_order(), busDTO.getGps_x(), busDTO.getGps_y(), busDTO.getCurrent_stop());

        return busRepository.save(busEntity);
    }

    @Transactional
    public void updateBus(BusUpdateDTO busUpdateDTO){

        BusDTO busDTO = busRepository.findByRoute_idAndBus_id(busUpdateDTO.getRoute_id(), busUpdateDTO.getBus_id());

        RouteStopDTO routeStopDTO = routeStopRepository.findNextStopByRoute_idAndStop_order(busDTO.getRoute_id(), busDTO.getCurrent_stop());
        StopDTO stopDTO = stopRepository.findById(routeStopDTO.getStop_id());

        double stop_gps_x = stopDTO.getGps_x();
        double stop_gps_y = stopDTO.getGps_y();

        double bus_gps_x = busDTO.getGps_x();
        double bus_gps_y = busDTO.getGps_y();

        if(distance(stop_gps_x, stop_gps_y, bus_gps_x, bus_gps_y) < 30)
            busDTO.setCurrent_stop(busDTO.getCurrent_stop() + 1);

        busDTO.setGps_x(busUpdateDTO.getGps_x());
        busDTO.setGps_y(busUpdateDTO.getGps_y());

        busRepository.updateById(busDTO.getId(), busUpdateDTO.getGps_x(), busUpdateDTO.getGps_y(), busDTO.getCurrent_stop());
    }

    public BusEntity deleteBus(int routeid, String busid){
        BusDTO busDTO = busRepository.findByRoute_idAndBus_id(routeid, busid);
        BusEntity busEntity = new BusEntity(busDTO.getId(), busDTO.getRoute_id(), busDTO.getBus_id(), busDTO.getInit_order(), busDTO.getGps_x(), busDTO.getGps_y(), busDTO.getCurrent_stop());

        busRepository.delete(busEntity);

        return busEntity;
    }
    private static double distance(double lat1, double lon1, double lat2, double lon2){
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1))* Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1))*Math.cos(deg2rad(lat2))*Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60*1.1515*1609.344;

        return dist; //단위 meter
    }

    //10진수를 radian(라디안)으로 변환
    private static double deg2rad(double deg){
        return (deg * Math.PI/180.0);
    }
    //radian(라디안)을 10진수로 변환
    private static double rad2deg(double rad){
        return (rad * 180 / Math.PI);
    }

}
