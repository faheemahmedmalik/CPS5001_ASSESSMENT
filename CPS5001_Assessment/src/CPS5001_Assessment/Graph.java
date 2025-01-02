package CPS5001_Assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


}
