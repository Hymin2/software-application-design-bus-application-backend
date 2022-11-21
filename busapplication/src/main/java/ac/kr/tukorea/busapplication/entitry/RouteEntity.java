package ac.kr.tukorea.busapplication.entitry;

import javax.persistence.*;

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
            name = "interval",
            nullable = false
    )
    private int interval;


}