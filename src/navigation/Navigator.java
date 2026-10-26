package navigation;

public class Navigator
{
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy)
    {
        if (routeStrategy==null)
        {
            throw new IllegalArgumentException("RouteStrategy cannot be null.");
        }
        this.routeStrategy=routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy)
    {
        if (routeStrategy==null)
        {
            throw new IllegalArgumentException("RouteStrategy cannot be null.");
        }
        this.routeStrategy= routeStrategy;
    }

    public void executeNavigation(String origin,String destination,double distanceKm)
    {
        String routeDetails= routeStrategy.buildRoute(origin, destination, distanceKm);
        System.out.println(routeDetails);
    }
}