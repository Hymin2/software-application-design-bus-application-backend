package ac.kr.tukorea.busapplication.DTO;

public class BusUpdateDTO {
    private int route_id;
    private String bus_id;
    private double gps_x;
    private double gps_y;

    public BusUpdateDTO(int route_id, String bus_id, double gps_x, double gps_y) {
        this.route_id = route_id;
        this.bus_id = bus_id;
        this.gps_x = gps_x;
        this.gps_y = gps_y;
    }

    public BusUpdateDTO() {
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public String getBus_id() {
        return bus_id;
    }

    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    public double getGps_x() {
        return gps_x;
    }

    public void setGps_x(double gps_x) {
        this.gps_x = gps_x;
    }

    public double getGps_y() {
        return gps_y;
    }

    public void setGps_y(double gps_y) {
        this.gps_y = gps_y;
    }
}
