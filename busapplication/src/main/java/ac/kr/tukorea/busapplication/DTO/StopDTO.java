package ac.kr.tukorea.busapplication.DTO;

import lombok.Data;

@Data
public class StopDTO{
    private int id;
    private String name;
    private double gps_x;
    private double gps_y;
    private String region_name;
    private String mobile_no;

    public StopDTO(int id, String name, double gps_x, double gps_y, String region_name, String mobile_no) {
        this.id = id;
        this.name = name;
        this.gps_x = gps_x;
        this.gps_y = gps_y;
        this.region_name = region_name;
        this.mobile_no = mobile_no;
    }

    public StopDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}
