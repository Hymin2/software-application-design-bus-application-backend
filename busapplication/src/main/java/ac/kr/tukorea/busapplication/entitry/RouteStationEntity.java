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



}
