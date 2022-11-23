package ac.kr.tukorea.busapplication.DTO;


public class RouteStationDTO {
    private int station_order;
    private String id;
    private String name;
    private int number;
    private double gps_x;
    private double gps_y;
    private String city_name;

    public RouteStationDTO(int station_order, String id, String name, int number, double gps_x, double gps_y, String city_name) {
        this.station_order = station_order;
        this.id = id;
        this.name = name;
        this.number = number;
        this.gps_x = gps_x;
        this.gps_y = gps_y;
        this.city_name = city_name;
    }

    public RouteStationDTO() {

    }

    public int getStation_order() {
        return station_order;
    }

    public void setStation_order(int station_order) {
        this.station_order = station_order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
