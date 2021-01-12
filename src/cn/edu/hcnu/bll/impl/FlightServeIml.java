package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServe;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.impl.FlightDaoIml;

import java.util.Set;

public class FlightServeIml implements IFlightServe {

    IFlightDao iFlightDao;

    public FlightServeIml() {
       iFlightDao = new FlightDaoIml();
    }

    @Override
   /* public void insertFight(Flight flight) {
        System.out.println("界面传来的航班信息："+flight);
    }*/

    public void insertFight(Flight flight) {
        iFlightDao.insertFight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirport(String departureAirport) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }

}
