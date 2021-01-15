package cn.edu.hcnu.ui;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServe;
import cn.edu.hcnu.bll.impl.FlightServeIml;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        while (true) {
        System.out.println("请输入相应的数字进行操作:");
        System.out.println("按1、信息录入");
        System.out.println("按2、信息显示");
        System.out.println("按3、查询航班信息");
        System.out.println("按4、机票预约");
        System.out.println("按5、机票退订");
        System.out.println("按6、退出系统");
        int choice = scr.nextInt();
            if(choice==1) {
                String id = UUID.randomUUID().toString().replace("-","");
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

                Flight flight = new Flight(id,flightID,planeType,allSeatsNum,departureAirport,destinationAirport,departureTime);
                IFlightServe flightserve = new FlightServeIml();
                try {
                    flightserve.insertFlight(flight);
                } catch (SQLException e) {
                    String errorMessage = e.getMessage();
                    if (errorMessage.startsWith("ORA-12899")) {
                        //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                        // 按指定模式在字符串查找
                        String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        // 创建 Pattern 对象
                        Pattern r = Pattern.compile(pattern);
                        // 现在创建 matcher 对象
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {
                            String tableName = m.group(4);
                            String columnName = m.group(5);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                        } else {
                            System.out.println("NO MATCH");
                        }
                    }
                }
                // System.out.println(flight.toString());
            } else if (choice==2) {
                IFlightServe iFlightServe = new FlightServeIml();

            //    Set<Flight> allFlights = null;
                try {
                    Set<Flight> allFlights = iFlightServe.getAllFlights();
                    //Set的遍历需要用到迭代器
                    for(Flight flight:allFlights) {
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            } else if (choice==3) {
                System.out.println("请您输入相应的数字进行查询:");
                System.out.println("按1、查询航班空座位");
                System.out.println("按2、查询起飞时间");
                System.out.println("按3、查询起飞机场");
                System.out.println("按4、查询到达机场");
                int choose = scr.nextInt();

                if(choose==1) {

                } else if (choose==2) {
                    System.out.print("请您输入起飞时间：");
                    String departureTime = scr.next();
                    IFlightServe iFlightServe = new FlightServeIml();
                    try {
                        Flight flight = iFlightServe.getFlightByDepartureTime(departureTime);
                        if(flight != null) {
                            System.out.println("您的查询结果是:"+flight);
                        }else {
                            System.out.println("没有你要查询的航班时间");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                } else if (choose==3) {
                    System.out.print("请您输入起飞地点：");
                    String departureAirport = scr.next();
                    IFlightServe iFlightServe = new FlightServeIml();
                    try {
                        Flight flight = iFlightServe.getFlightByDepartureAirport(departureAirport);
                        if(flight != null) {
                            System.out.println("您的查询结果是:"+flight);
                        }else {
                            System.out.println("没有你要查询的航班时间");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else if (choose==4) {//destinationAirport
                    System.out.print("请您输入到达地点：");
                    String destinationAirport = scr.next();
                    IFlightServe iFlightServe = new FlightServeIml();
                    try {
                        Flight flight = iFlightServe.getFlightByDestinationAirport(destinationAirport);
                        if(flight != null) {
                            System.out.println("您的查询结果是:"+flight);
                        }else {
                            System.out.println("没有你要查询的航班时间");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }

}
