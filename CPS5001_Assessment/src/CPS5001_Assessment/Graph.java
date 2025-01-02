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


}
