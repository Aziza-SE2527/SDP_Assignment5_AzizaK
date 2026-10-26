package navigation;

public class CarStrategy implements RouteStrategy
{
    private static final double AVERAGE_SPEED_KMH=50.0;

    @Override
    public String buildRoute(String origin,String destination,double distanceKm)
    {
        double timeMinutes= (distanceKm / AVERAGE_SPEED_KMH) * 60;
        return String.format("[Car Route] %s -> %s via main roads (%.1f km) | Est. time: %.0f mins (traffic factored)",
                origin, destination,distanceKm, timeMinutes);
    }
}