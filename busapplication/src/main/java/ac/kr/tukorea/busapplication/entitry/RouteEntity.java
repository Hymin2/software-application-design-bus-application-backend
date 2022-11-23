package ac.kr.tukorea.busapplication.entitry;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Route")
@Table(name = "route_table")
public class RouteEntity {
    @Id
    @Column(
            name = "id"
    )
    private String id;

    @Column(
            name = "number",
            nullable = false
    )
    private int number;

    @Column(
            name = "starting_point",
            nullable = false
    )
    private String starting_point;

    @Column(
            name = "terminal",
            nullable = false
    )
    private String terminal;

    @Column(
            name = "first_time",
            nullable = false
    )
    private int first_time;

    @Column(
            name = "last_time",
            nullable = false
    )
    private int last_time;

    @Column(
            name = "bus_interval",
            nullable = false
    )
    private int bus_interval;

    @OneToMany(mappedBy = "route")
    private List<BusEntity> bus_id = new ArrayList<>();

    @OneToMany(mappedBy = "route")
    private List<RouteStationEntity> stations = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStarting_point() {
        return starting_point;
    }

    public void setStarting_point(String starting_point) {
        this.starting_point = starting_point;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public int getFirst_time() {
        return first_time;
    }

    public void setFirst_time(int first_time) {
        this.first_time = first_time;
    }

    public int getLast_time() {
        return last_time;
    }

    public void setLast_time(int last_time) {
        this.last_time = last_time;
    }

    public int getBus_interval() {
        return bus_interval;
    }

    public void setBus_interval(int bus_interval) {
        this.bus_interval = bus_interval;
    }

    public List<BusEntity> getBus_id() {
        return bus_id;
    }

    public void setBus_id(List<BusEntity> bus_id) {
        this.bus_id = bus_id;
    }

    public List<RouteStationEntity> getStations() {
        return stations;
    }

    public void setStations(List<RouteStationEntity> stations) {
        this.stations = stations;
    }
}