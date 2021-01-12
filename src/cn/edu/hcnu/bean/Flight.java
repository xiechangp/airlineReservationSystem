package cn.edu.hcnu.bean;

import java.util.Date;

public class Flight {//航班
    private String id;
    private String planeType;//飞机的类型
    private String seatsNo;//座位号
    private int totalSeatsNum;//座位总数量
    private String departureAirport;//出发机场
    private String destinationAirport;//目的地机场
    private String departureTime;//起飞时间
   // private String detinationTime;//达到时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(String seatsNo) {
        this.seatsNo = seatsNo;
    }

    public int getTotalSeatsNum() {
        return totalSeatsNum;
    }

    public void setTotalSeatsNum(int totalSeatsNum) {
        this.totalSeatsNum = totalSeatsNum;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}