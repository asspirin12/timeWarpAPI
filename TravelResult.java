
public class TravelResult {
    private boolean success;
    private String message;
    private Traveler traveler;
    private Destination destination;

    public TravelResult(boolean success, String message, Traveler traveler, Destination destination) {
        this.success = success;
        this.message = message;
        this.traveler = traveler;
        this.destination = destination;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public Destination getDestination() {
        return destination;
    }
}
