package navigation;

public class WalkStrategy implements RouteStrategy
{
    private static final double AVERAGE_SPEED_KMH=5.0;
    private static final double PEDESTRIAN_SHORTCUT_FACTOR=0.85;

    @Override
    public String buildRoute(String origin,String destination,double distanceKm)
    {
        double actualDistance=distanceKm * PEDESTRIAN_SHORTCUT_FACTOR;
        double timeMinutes=(actualDistance/AVERAGE_SPEED_KMH)*60;
        return String.format("[Walking Route] %s -> %s via pedestrian paths (%.1f km) | Est. time: %.0f mins",
                origin, destination,actualDistance,timeMinutes);
    }
}