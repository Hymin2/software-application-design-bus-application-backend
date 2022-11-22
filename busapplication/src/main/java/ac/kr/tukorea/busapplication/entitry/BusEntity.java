package ac.kr.tukorea.busapplication.entitry;

import javax.persistence.*;

@Entity(name = "Bus")
@Table(name="bus_table")
public class BusEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id"
    )
    private long id;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private RouteEntity route;

    @Column(
            name = "order",
            nullable = false
    )
    private int order;

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


}