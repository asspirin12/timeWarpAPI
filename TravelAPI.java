
public class TravelAPI {

    // Method to initiate travel
    public TravelResult initiateTravel(Traveler traveler, Destination destination) throws InvalidDestinationException, InvalidTravelerException, TravelFailureException {
        // Validate the traveler and destination
        validateTraveler(traveler);
        validateDestination(destination);

        // If validation passes, initiate the travel process
        if (travelOperation(traveler, destination)) {
            return new TravelResult(true, "Travel successful!", traveler, destination);
        } else {
            throw new TravelFailureException("Travel operation failed due to unforeseen circumstances.");
        }
    }

    // Private method to validate the traveler
    private void validateTraveler(Traveler traveler) throws InvalidTravelerException {
        if (traveler == null || traveler.getId() == null || traveler.getName().isEmpty()) {
            throw new InvalidTravelerException("Invalid Traveler details.");
        }
    }

    // Private method to validate the destination
    private void validateDestination(Destination destination) throws InvalidDestinationException {
        if (destination == null || destination.getDescription().isEmpty()) {
            throw new InvalidDestinationException("Invalid destination.");
        }
    }

    // Simulate the actual travel operation
    private boolean travelOperation(Traveler traveler, Destination destination) {
        return Math.random() > 0.2; // 80% chance of successful travel
    }
}
