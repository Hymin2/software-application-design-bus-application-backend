package ac.kr.tukorea.busapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Route")
@Table(name="route_table")
public class RouteEntity {
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
            name = "st_sta_nm"
    )
    private String st_sta_sm;

    @Column(
            name = "ed_sta_nm"
    )
    private String ed_sta_nm;

    @Column(
            name = "up_first_time"
    )
    private String up_first_time;

    @Column(
            name = "up_last_time"
    )
    private String up_last_time;

    @Column(
            name = "down_first_time"
    )
    private String down_first_time;

    @Column(
            name = "down_last_time"
    )
    private String down_last_time;

    @Column(
            name = "peek_alloc"
    )
    private String peek_alloc;

    @Column(
            name = "npeek_alloc"
    )
    private String npeek_alloc;

    @Column(
            name = "region_name"
    )
    private String region_name;
}
