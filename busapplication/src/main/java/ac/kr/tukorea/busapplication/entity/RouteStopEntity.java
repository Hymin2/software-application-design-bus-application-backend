package ac.kr.tukorea.busapplication.entity;

import javax.persistence.*;

@Entity(name = "RouteStop")
@Table(name="route_stop_table")
public class RouteStopEntity {
    @Id
    @Column(
            name = "id",
            nullable = false
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int id;

    @Column(
            name = "route_id"
    )
    private int route_id;

    @Column(
            name = "stop_id"
    )
    private int stop_id;

    @Column(
            name = "updown"
    )
    private String updown;

    @Column(
            name = "stop_order"
    )
    private int stop_order;

    @Column(
            name = "route_name"
    )
    private int route_name;

    @Column(
            name = "stop_name"
    )
    private String stop_name;
}
