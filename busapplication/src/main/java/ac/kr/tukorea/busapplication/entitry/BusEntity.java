package ac.kr.tukorea.busapplication.entitry;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

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

    public long getId() {
        return id;
    }

    public RouteEntity getRoute() {
        return route;
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

    @Override
    public String toString() {
        return "BusEntity{" +
                "id=" + id +
                ", route=" + route +
                ", init_order=" + init_order +
                ", gps_x=" + gps_x +
                ", gps_y=" + gps_y +
                '}';
    }
}