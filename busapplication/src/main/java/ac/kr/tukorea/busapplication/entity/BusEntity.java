package ac.kr.tukorea.busapplication.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;


@DynamicUpdate
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

    @Column(
            name = "route_id",
            nullable = false
    )
    private int route_id;

    @Column(
            name = "bus_id",
            nullable = false
    )
    private String bus_id;

    @Column(
            name = "init_order",
            nullable = false
    )
    private int init_order;

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

    @Column(
            name = "current_stop",
            nullable = false
    )
    private int current_stop;

    public BusEntity(long id, int route_id, String bus_id, int init_order, double gps_x, double gps_y, int current_stop) {
        this.id = id;
        this.route_id = route_id;
        this.bus_id = bus_id;
        this.init_order = init_order;
        this.gps_x = gps_x;
        this.gps_y = gps_y;
        this.current_stop = current_stop;
    }

    public BusEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public String getBus_id() {
        return bus_id;
    }

    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    public int getInit_order() {
        return init_order;
    }

    public void setInit_order(int init_order) {
        this.init_order = init_order;
    }

    public double getGps_x() {
        return gps_x;
    }

    public void setGps_x(double gps_x) {
        this.gps_x = gps_x;
    }

    public double getGps_y() {
        return gps_y;
    }

    public void setGps_y(double gps_y) {
        this.gps_y = gps_y;
    }

    public int getCurrent_stop() {
        return current_stop;
    }

    public void setCurrent_stop(int current_stop) {
        this.current_stop = current_stop;
    }
}