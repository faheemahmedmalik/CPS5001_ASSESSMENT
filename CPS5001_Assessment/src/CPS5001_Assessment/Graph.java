package CPS5001_Assessment;

import java.util.*;

public class Graph {

    private Map<Node, List<Edge>> list = new HashMap<>();

    public void addNode(Node root) {
        if(!list.containsKey(root)){
            list.put(root,new ArrayList<>());
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




    }
