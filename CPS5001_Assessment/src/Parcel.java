// Represents a parcel to be delivered to a specific destination.
public class Parcel {
    private String id;
    private Node destination;
    private double weight;
    private double deadline;

    // Constructor
    public Parcel(String id, Node destination, double weight, double deadline) {
        this.id = id;
        this.destination = destination;
        this.weight = weight;
        this.deadline = deadline;
    }

    // Returns the ID of the parcel
    public String getId() {
        return id;
    }

    // Returns the destination node of the parcel
    public Node getDestination() {
        return destination;
    }

    // Returns the weight of the parcel
    public double getWeight() {
        return weight;
    }

    // Returns the delivery deadline of the parcel
    public double getDeadline() {
        return deadline;
    }

    // Returns a string representation
    @Override
    public String toString() {
        return "Parcel{id='" + id + "', destination=" + destination +
                ", weight=" + weight + ", deadline=" + deadline + '}';
    }
}
