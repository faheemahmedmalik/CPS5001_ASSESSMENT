package CPS5001_Assessment;

import java.util.*;


public class DeliveryScheduler {
    Graph g;
    Map<Van, List<Parcel>> v = new HashMap<>();
    PriorityQueue<Parcel> p = new PriorityQueue<>(Comparator.comparingDouble(Parcel::getDeadline));

    public DeliveryScheduler(Graph graph) {
        this.g = graph;
    }





}
