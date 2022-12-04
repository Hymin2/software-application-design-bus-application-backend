package ac.kr.tukorea.busapplication.DTO;

public class RouteDTO {
    private int id;
    private String name;
    private String st_sta_nm;
    private String ed_sta_nm;
    private String up_first_time;
    private String up_last_time;
    private String peek_alloc;
    private String npeek_alloc;
    private String region_name;

    public RouteDTO(int id, String name, String st_sta_nm, String ed_sta_nm, String up_first_time, String up_last_time, String peek_alloc, String npeek_alloc, String region_name) {
        this.id = id;
        this.name = name;
        this.st_sta_nm = st_sta_nm;
        this.ed_sta_nm = ed_sta_nm;
        this.up_first_time = up_first_time;
        this.up_last_time = up_last_time;
        this.peek_alloc = peek_alloc;
        this.npeek_alloc = npeek_alloc;
        this.region_name = region_name;
    }

    public RouteDTO() {
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

    public String getSt_sta_nm() {
        return st_sta_nm;
    }

    public void setSt_sta_sm(String st_sta_nm) {
        this.st_sta_nm = st_sta_nm;
    }

    public String getEd_sta_nm() {
        return ed_sta_nm;
    }

    public void setEd_sta_nm(String ed_sta_nm) {
        this.ed_sta_nm = ed_sta_nm;
    }

    public String getUp_first_time() {
        return up_first_time;
    }

    public void setUp_first_time(String up_first_time) {
        this.up_first_time = up_first_time;
    }

    public String getUp_last_time() {
        return up_last_time;
    }

    public void setUp_last_time(String up_last_time) {
        this.up_last_time = up_last_time;
    }

    public String getPeek_alloc() {
        return peek_alloc;
    }

    public void setPeek_alloc(String peek_alloc) {
        this.peek_alloc = peek_alloc;
    }

    public String getNpeek_alloc() {
        return npeek_alloc;
    }

    public void setNpeek_alloc(String npeek_alloc) {
        this.npeek_alloc = npeek_alloc;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
