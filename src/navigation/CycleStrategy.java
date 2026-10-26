package navigation;

public class CycleStrategy implements RouteStrategy
{
    private static final double AVERAGE_SPEED_KMH=18.0;
    private static final double BIKE_LANE_FACTOR=0.92;

    @Override
    public String buildRoute(String origin,String destination,double distanceKm)
    {
        double actualDistance=distanceKm * BIKE_LANE_FACTOR;
        double timeMinutes=(actualDistance / AVERAGE_SPEED_KMH) * 60;
        return String.format("[Cycling Route] %s -> %s via dedicated bike lanes (%.1f km) | Est. time: %.0f mins",
                origin,destination,actualDistance,timeMinutes);
    }
}