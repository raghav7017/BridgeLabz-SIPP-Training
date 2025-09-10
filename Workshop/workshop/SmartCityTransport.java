package workshop;
import java.util.*;
import java.util.stream.*;

    interface TransportService {
    String getServiceName();
    List<Schedule> getSchedules();
    double getFare(Passenger passenger);

    default void printServiceDetails() {
        System.out.println("Service: " + getServiceName());
        getSchedules().forEach(System.out::println);
    }
     static double calculateDistance(Location a, Location b) {
        // Simple placeholder: Euclidean
        double dx = a.latitude - b.latitude;
        double dy = a.longitude - b.longitude;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
interface FareCalculator {
    double calculateFare(TransportService service, Passenger passenger);
}

interface EmergencyService {} // Marker interface

class Location {
    double latitude, longitude;
    Location(double lat, double lon) { latitude = lat; longitude = lon; }
}

class Schedule {
    String time;
    String startPoint, endPoint;
    Schedule(String t, String sp, String ep) { time = t; startPoint = sp; endPoint = ep; }
    public String toString() { return String.format("%s %s→%s", time, startPoint, endPoint); }
}
class Passenger {
    String name;
    String route;
    double fare;
    boolean peakTime;
    public Passenger(String n, String r, double f, boolean p) { name=n; route=r; fare=f; peakTime=p; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public boolean isPeakTime() { return peakTime; }
}

class BusService implements TransportService {
    public String getServiceName() { return "Bus"; }
    public List<Schedule> getSchedules() { return Arrays.asList(new Schedule("08:00", "A", "B")); }
    public double getFare(Passenger p) { return 40; }
}
class MetroService implements TransportService {
    public String getServiceName() { return "Metro"; }
    public List<Schedule> getSchedules() { return Arrays.asList(new Schedule("08:15", "C", "D")); }
    public double getFare(Passenger p) { return 60; }
}

class TaxiService implements TransportService {
    public String getServiceName() { return "Taxi"; }
    public List<Schedule> getSchedules() { return Arrays.asList(new Schedule("Anytime", "Anywhere", "Destination")); }
    public double getFare(Passenger p) { return 100; }
}

class AmbulanceService implements TransportService, EmergencyService {
    public String getServiceName() { return "Ambulance"; }
    public List<Schedule> getSchedules() { return Arrays.asList(new Schedule("On Call", "Any", "Hospital")); }
    public double getFare(Passenger p) { return 0; }
}
public class SmartCityTransport {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService(),
            new MetroService(),
            new TaxiService(),
            new AmbulanceService()
        );

        List<Passenger> passengers = Arrays.asList(
            new Passenger("Alice", "A-B", 40, true),
            new Passenger("Bob", "C-D", 60, false),
            new Passenger("Eve", "A-B", 40, false),
            new Passenger("Charlie", "Anywhere-Dest", 100, true)
        );
        // 1. Filter/sort services (lambda, stream)
        List<TransportService> sorted = services.stream()
            .filter(s -> ! (s instanceof EmergencyService)) // Only non-emergency for booking
            .sorted(Comparator.comparing(TransportService::getServiceName))
            .collect(Collectors.toList());

        // 2. ForEach dashboard
        System.out.println("Live Schedules:");
        sorted.forEach(TransportService::printServiceDetails);

        // 3. Fare calculator (functional)
        FareCalculator calc = (srv, pas) -> srv.getFare(pas);
        System.out.println("Fare for Alice by Bus: " + calc.calculateFare(services.get(0), passengers.get(0)));

        // 4. Collectors - Grouping, Partitioning, Summarizing
        Map<String, List<Passenger>> byRoute = passengers.stream()
            .collect(Collectors.groupingBy(Passenger::getRoute));

        Map<Boolean, List<Passenger>> peakMap = passengers.stream()
            .collect(Collectors.partitioningBy(Passenger::isPeakTime));

        DoubleSummaryStatistics stats = passengers.stream()
            .collect(Collectors.summarizingDouble(Passenger::getFare));

        System.out.println("Passengers grouped by route: " + byRoute);
        System.out.println("Passengers partitioned by peak time: " + peakMap);
        System.out.println("Fare stats: " + stats);

        // 5. Emergency service detection
        services.forEach(sv -> {
            if (sv instanceof EmergencyService) {
                System.out.println("Emergency Service Active: " + sv.getServiceName());
            }
        });

        // 6. Extending: Add new services (e.g. FerryService)
        // class FerryService implements TransportService {...}
        // Add to 'services' list: minimal changes needed.
    }
}

    
    
