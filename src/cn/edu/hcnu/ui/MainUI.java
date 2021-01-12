package cn.edu.hcnu.ui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServe;
import cn.edu.hcnu.bll.impl.FlightServeIml;

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        while (true) {
        System.out.println("请按相应的需求按键:");
        System.out.println("按1、信息录入");
        System.out.println("按2、信息显示");
        System.out.println("按3、查询航班信息");
        System.out.println("按4、机票预约");
        System.out.println("按5、机票退订");
        System.out.println("按6、退出系统");
        int s = scr.nextInt();
            if(s==1) {
                String id = UUID.randomUUID().toString();
                System.out.print("航班ID:");
                String flightID = scr.next();
                System.out.print("飞机的类型:");
                String planeType = scr.next();
                System.out.print("飞机总座位数:");
                int allSeatsNum = scr.nextInt();
                System.out.print("出发机场:");
                String departureAirport = scr.next();
                System.out.print("目的地机场:");
                String destinationAirport = scr.next();
                System.out.print("起飞时间:");
                String departureTime = scr.next();
                Flight flight = new Flight(flightID,planeType,allSeatsNum,departureAirport,destinationAirport,departureTime);
                IFlightServe flightserve = new FlightServeIml();
                flightserve.insertFight(flight);
                // System.out.println(flight.toString());
            }

        }

    }

}
