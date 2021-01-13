package cn.edu.hcnu.bean;

import java.util.Date;

public class Flight {//航班
    private String id;
    private String flightID;
    private String planeType;//飞机的类型
    private int allSeatsNum;//座位总数量
    private String departureAirport;//出发机场
    private String destinationAirport;//目的地机场
    private String departureTime;//起飞时间
   // private String detinationTime;//达到时间

    public Flight(String id,String flightID, String planeType, int allSeatsNum, String departureAirport, String destinationAirport, String departureTime) {
        this.id = id;
        this.flightID = flightID;
        this.planeType = planeType;
        this.allSeatsNum = allSeatsNum;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getAllSeatsNum() {
        return allSeatsNum;
    }

    public void setAllSeatsNum(int allSeatsNum) {
        this.allSeatsNum = allSeatsNum;
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

    @Override
    public String toString() {
        return "Flight{" +
                "flightID='" + flightID + '\'' +
                ", planeType='" + planeType + '\'' +
                ", allSeatsNum=" + allSeatsNum +
                ", departureAirport='" + departureAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
