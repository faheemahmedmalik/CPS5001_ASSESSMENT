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


    public void incrementVehicleCount() {
        vehicleCount++;
        updateCongestion();
    }

    public void decrementVehicleCount() {
        if (vehicleCount > 0) {
            vehicleCount--;
            updateCongestion();
        }
    }

    private void updateCongestion() {

        congestion = vehicleCount * 2;
    }


    public double getEffectiveDistance() {
        return distance + congestion; //   distance + congestion
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

    public double getCongestion() {return congestion;}


    @Override
    public String toString() {
        return destination + " (Distance: " + distance + ", Congestion: " + congestion + ")";
    }
}








