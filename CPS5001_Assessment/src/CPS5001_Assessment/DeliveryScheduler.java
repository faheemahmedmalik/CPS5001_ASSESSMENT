package CPS5001_Assessment;

import java.util.*;


public class DeliveryScheduler {
    Graph g;
    Map<Van, List<Parcel>> v = new HashMap<>();
    PriorityQueue<Parcel> p = new PriorityQueue<>(Comparator.comparingDouble(Parcel::getDeadline));

    public DeliveryScheduler(Graph graph) {
        this.g = graph;
    }



    public void addVan(Van curr_van) {
        v.put(curr_van, new ArrayList<>());
    }
    public void addParcel(Parcel curr_parcel) {
        p.add(curr_parcel);





}
