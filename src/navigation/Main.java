package navigation;

public class Main
{
    public static void main(String[] args)
    {
        String origin="Astana IT University";
        String destination="Khan Shatyr";
        double baseDistanceKm= 6.5;

        System.out.println(" Initializing Navigator with CarStrategy ");
        Navigator navigator= new Navigator(new CarStrategy());
        navigator.executeNavigation(origin,destination,baseDistanceKm);

        System.out.println("\n Heavy traffic detected! Switching to CycleStrategy at runtime ");
        navigator.setRouteStrategy(new CycleStrategy());
        navigator.executeNavigation(origin, destination, baseDistanceKm);

        System.out.println("\n Good weather! Switching to WalkStrategy at runtime");
        navigator.setRouteStrategy(new WalkStrategy());
        navigator.executeNavigation(origin,destination,baseDistanceKm);
    }
}