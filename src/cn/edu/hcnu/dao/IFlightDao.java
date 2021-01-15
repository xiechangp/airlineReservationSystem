package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime) throws SQLException;
    Flight getFlightByDepartureAirport(String departureAirport) throws SQLException;
    Flight getFlightByDestinationAirport(String destinationAirport) throws SQLException;
    void updateFlight(Flight flight);
}
