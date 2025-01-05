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
        // Example formula: Each vehicle adds 2 units of congestion
        congestion = vehicleCount * 2;
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
