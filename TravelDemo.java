
public class TravelDemo {
    public static void main(String[] args) {
        TravelAPI api = new TravelAPI();
        
        Traveler traveler = new Traveler("12345", "John Doe");

        Destination[] destinations = {
            new Destination("1776: American Revolution"),
            new Destination("2001: Millennium"),
            new Destination("1789: French Revolution"),
            new Destination("-44: Assassination of Julius Caesar"),
            new Destination("2450: Distant Future Exploration")
        };

        for (int i = 1 ; i < 3; i++) {
            System.out.println("Attempting to send traveler to: " + destinations[i].getDescription());
            try {
                TravelResult result = api.initiateTravel(traveler, destinations[i]);
                if (result.isSuccess()) {
                    System.out.println(result.getMessage() + " Traveler arrived at: " + result.getDestination().getDescription());
                }
            } catch (InvalidDestinationException e) {
                System.err.println("Failed to travel to: " + destinations[i].getDescription() + ". Error: " + e.getMessage());
            } catch (InvalidTravelerException e) {
                throw new RuntimeException(e);
            } catch (TravelFailureException e) {
                throw new RuntimeException(e);
            }
            System.out.println("------------------------------------------");

             i = (i + 1) % destinations.length;
        }
    }
}
