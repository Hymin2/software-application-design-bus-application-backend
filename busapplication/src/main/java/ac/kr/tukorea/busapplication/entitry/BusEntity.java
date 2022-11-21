package ac.kr.tukorea.busapplication.entitry;

import javax.persistence.*;

@Entity(name = "Bus")
@Table(name="bus_table")
public class BusEntity {
    @Id
    @SequenceGenerator(
            name = "bus_sequence",
            sequenceName = "bus_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "bus_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "id"
    )
    private long id;
    private long route_id;

    private long station_id;
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