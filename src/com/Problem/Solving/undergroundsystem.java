package com.Problem.Solving;

import java.util.HashMap;
import java.util.Map;

public class undergroundsystem {
	class CheckInInfo {
        String station;
        int time;
		public double totalTime;
		public double count;

        CheckInInfo(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class RouteInfo {
        long totalTime;
        int count;

        RouteInfo(long totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

	private static final Map<Integer, CheckInInfo> AttributeMap = null;

    private Map<Integer, CheckInInfo> checkInMap;
    private Map<String, RouteInfo> routeMap;

    public void UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo info = checkInMap.get(id);

        String route = info.station + "-" + stationName;
        int travelTime = t - info.time;

        RouteInfo stats = routeMap.getOrDefault(route,
                new RouteInfo(0, 0));

        stats.totalTime += travelTime;
        stats.count++;

        routeMap.put(route, stats);

        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "-" + endStation;

        CheckInInfo stats = AttributeMap.get(route);

        return (double) stats.totalTime / stats.count;
    }
}
