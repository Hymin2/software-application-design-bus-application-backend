package ac.kr.tukorea.busapplication.entitry;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private String number;

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

    @JsonIgnore
    @OneToMany(mappedBy = "route")
    private List<BusEntity> bus_id = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "route")
    private List<RouteStationEntity> stations = new ArrayList<>();

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getStarting_point() {
        return starting_point;
    }

    public String getTerminal() {
        return terminal;
    }

    public int getFirst_time() {
        return first_time;
    }

    public int getLast_time() {
        return last_time;
    }
    public int getBus_interval() {
        return bus_interval;
    }

    public List<BusEntity> getBus_id() {
        return bus_id;
    }

    public List<RouteStationEntity> getStations() {
        return stations;
    }

    @Override
    public String toString() {
        return "RouteEntity{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", starting_point='" + starting_point + '\'' +
                ", terminal='" + terminal + '\'' +
                ", first_time=" + first_time +
                ", last_time=" + last_time +
                ", bus_interval=" + bus_interval +
                ", bus_id=" + bus_id +
                ", stations=" + stations +
                '}';
    }
}