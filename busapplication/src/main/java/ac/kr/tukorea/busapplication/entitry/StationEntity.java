package ac.kr.tukorea.busapplication.entitry;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Station")
@Table(name="station_table")
public class StationEntity {
    @Id
    @Column(
            name = "id"
    )
    private String id;

    @Column(
            name = "name",
            nullable = false
    )
    private String name;

    @Column(
            name = "city_name",
            nullable = false
    )
    private String city_name;

    @Column(
            name = "number",
            nullable = false
    )
    private int number;

    @Column(
            name = "gps_x",
            nullable = false
    )
    private double gps_x;

    @Column(
            name = "gps_y",
            nullable = false
    )
    private double gps_y;

    @OneToMany(mappedBy = "station")
    private List<RouteStationEntity> routes = new ArrayList<>();

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

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
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

    public List<RouteStationEntity> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteStationEntity> routes) {
        this.routes = routes;
    }
}