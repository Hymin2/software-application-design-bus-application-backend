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

    public void setId(long id) {
        this.id = id;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public void setRoute(RouteEntity route) {
        this.route = route;
    }

    public StationEntity getStation() {
        return station;
    }

    public void setStation(StationEntity station) {
        this.station = station;
    }

    public int getStation_order() {
        return station_order;
    }

    public void setStation_order(int station_order) {
        this.station_order = station_order;
    }
}
