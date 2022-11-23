package ac.kr.tukorea.busapplication.entitry;

import javax.persistence.*;

@Entity(name = "RouteStation")
@Table(name = "route_station_table")
public class RouteStationEntity {
    @Id
    @Column(
            name = "id"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private RouteEntity route;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private StationEntity station;

    @Column(
            name = "station_order",
            nullable = false
    )
    private int station_order;

    public long getId() {
        return id;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public StationEntity getStation() {
        return station;
    }

    public int getStation_order() {
        return station_order;
    }

    @Override
    public String toString() {
        return "RouteStationEntity{" +
                "id=" + id +
                ", route=" + route +
                ", station=" + station +
                ", station_order=" + station_order +
                '}';
    }
}
