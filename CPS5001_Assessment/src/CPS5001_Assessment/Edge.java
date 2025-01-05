package CPS5001_Assessment;

public class Edge {
    private Node source;
    private Node destination;
    private double distance;
    private double congestion;
    private int vehicleCount;




    public Edge(Node source, Node destination, double distance, double congestion) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.congestion = congestion;
        this.vehicleCount = 0;


    }



// getter and setter methods
    public Node getSource() {
        return source;
    }

    public Node getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }





}
