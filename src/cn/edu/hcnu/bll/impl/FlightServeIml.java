package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServe;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.impl.FlightDaoIml;

import java.sql.SQLException;
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

    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        return iFlightDao.getAllFlights();
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) throws SQLException {
        return iFlightDao.getFlightByDepartureTime(departureTime);
    }

    @Override
    public Flight getFlightByDepartureAirport(String departureAirport) throws SQLException {
        return iFlightDao.getFlightByDepartureAirport(departureAirport);
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) throws SQLException {
        return iFlightDao.getFlightByDestinationAirport(destinationAirport);
    }

    @Override
    public void updateFlight(Flight flight) {

    }

}
