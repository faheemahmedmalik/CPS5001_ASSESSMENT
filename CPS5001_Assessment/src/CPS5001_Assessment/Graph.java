package CPS5001_Assessment;

import java.util.*;

public class Graph {

    private Map<Node, List<Edge>> list = new HashMap<>();

    public void addNode(Node root) {
        if (!list.containsKey(root)) {
            list.put(root, new ArrayList<>());
        }
    }


    public void addEdge(Node source, Node destination, double distance, double congestion) {


        Edge edge = new Edge(source, destination, distance, congestion);
        list.get(source).add(edge);
    }

    public List<Node> dijkstraAlgo(Node start, Node end) {
        Map<Node, Double> distances = new HashMap<>();
        Map<Node, Node> visited = new HashMap<>();
        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingDouble(distances::get));


        for (Node n : list.keySet()) {
            distances.put(n, Double.MAX_VALUE);
        }
        distances.put(start, 0.0);
        q.add(start);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            for (Edge e : list.getOrDefault(temp, Collections.emptyList())) {
                Node nbr = e.getDestination();
                double addedDist = distances.get(temp) + e.getDistance();

                if (addedDist < distances.get(nbr)) {
                    distances.put(nbr, addedDist);
                    visited.put(nbr, temp);
                    q.add(nbr);
                }
            }
        }

        List<Node> city_sequence = new ArrayList<>();
        Node n = end;
        while (n != null) {
            city_sequence.addFirst(n);
            n = visited.get(n);
        }
        return city_sequence;
    }

    public Edge getEdgeBetween(Node src, Node dest) {
        List<Edge> edges = list.get(src);
        for (Edge edge : edges) {
            if (edge.getDestination().equals(dest)) {
                return edge;
            }
        }
        return null;
    }

    public List<Edge> getEdgesFromNode(Node src) {
        return list.getOrDefault(src, List.of());
    }

    public String displayGraph() {
        StringBuilder sb = new StringBuilder();
        for (var entry : list.entrySet()) {
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}