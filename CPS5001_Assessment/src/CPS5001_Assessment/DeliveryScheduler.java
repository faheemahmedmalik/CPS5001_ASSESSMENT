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


    public void scheduleParcels(Node source_node) {
        while (!p.isEmpty()) {
            Parcel temp = p.poll();
            Van assignedVan = findSuitableVan(temp);

            if (assignedVan != null) {
                assignedVan.addParcel(temp);
                v.get(assignedVan).add(temp);
                List<Node> route = g.dijkstraAlgo(source_node, temp.getDestination());
                System.out.println("Assigned " + temp + " to van " + assignedVan.getId());

                for (int i = 0; i < route.size() - 1; i++) {
                    Node source = route.get(i);
                    Node destination = route.get(i + 1);

                    // Find the edge and simulate traversal
                    Edge edge = g.getEdgeBetween(source, destination);
                    traverseEdgeStepByStep(edge.getDistance(), source, destination);
                }
            } else {
                System.out.println("No suitable van available for parcel: " + temp);
            }
        }
    }


    public void vehicleCounts(List<Node> route, boolean flag) {
        for (int i = 0; i < route.size() - 1; i++) {
            Node temp_src = route.get(i);
            Node temp_dest = route.get(i + 1);
            for (Edge edge : g.getEdgesFromNode(temp_src)) {
                if (edge.getDestination().equals(temp_dest)) {
                    if (flag) {
                        edge.incrementVehicleCount();
                    } else {
                        edge.decrementVehicleCount();
                    }
                }
            }
        }
    }

    public Van findSuitableVan(Parcel parcel) {
        for (Van van : v.keySet()) {
            if (van.canAccommodate(parcel.getWeight())) {
                return van;
            }
        }
        return null;
    }

    public void displaySchedule() {
        System.out.println("\n=== Delivery Schedule ===");
        for (Van van : v.keySet()) {
            System.out.println(van);
        }
    }

    public void traverseEdgeStepByStep(double distance, Node src, Node dest) {
        System.out.println("Traversing from " + src.getName() + " to " + dest.getName() + ":");
        for (int i = 1; i <= distance; i++) {
            System.out.println("Step " + i + " of " + (int) distance);
        }
        System.out.println("Reached " + dest.getName() + ".\n");
    }







}



