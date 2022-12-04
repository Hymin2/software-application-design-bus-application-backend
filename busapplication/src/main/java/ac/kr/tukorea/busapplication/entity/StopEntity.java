package ac.kr.tukorea.busapplication.entity;

import javax.persistence.*;

@Entity(name = "Stop")
@Table(name="stop_table")
public class StopEntity {
    @Id
    @Column(
            name = "id",
            nullable = false
    )
    private int id;

    @Column(
            name = "name"
    )
    private String name;

    @Column(
            name = "gps_x"
    )
    private double gps_x;

    @Column(
            name = "gps_y"
    )
    private double gps_y;

    @Column(
            name = "region_name"
    )
    private String region_name;

    @Column(
            name = "mobile_no"
    )
    private String mobile_no;
}