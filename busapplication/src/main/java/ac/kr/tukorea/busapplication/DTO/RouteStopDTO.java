package ac.kr.tukorea.busapplication.DTO;

import javax.persistence.Column;

public class RouteStopDTO {
    private int stop_id;
    private String stop_name;
    private int stop_order;
    private String updown;
    private String mobile_no;

    public RouteStopDTO(int stop_id, String stop_name, int stop_order, String updown, String mobile_no) {
        this.stop_id = stop_id;
        this.stop_name = stop_name;
        this.stop_order = stop_order;
        this.updown = updown;
        this.mobile_no = mobile_no;
    }

    public RouteStopDTO(int stop_id, String stop_name, int stop_order, String updown) {
        this.stop_id = stop_id;
        this.stop_name = stop_name;
        this.stop_order = stop_order;
        this.updown = updown;
    }

    public RouteStopDTO() {
    }

    public int getStop_id() {
        return stop_id;
    }

    public void setStop_id(int stop_id) {
        this.stop_id = stop_id;
    }

    public String getStop_name() {
        return stop_name;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }

    public int getStop_order() {
        return stop_order;
    }

    public void setStop_order(int stop_order) {
        this.stop_order = stop_order;
    }

    public String getUpdown() {
        return updown;
    }

    public void setUpdown(String updown) {
        this.updown = updown;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }
}
