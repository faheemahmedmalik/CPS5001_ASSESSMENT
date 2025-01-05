package CPS5001_Assessment;


public class Main {
    public static void main(String[] args) {

        CityLogisticsTerminal terminal = new CityLogisticsTerminal();



        Address hubAddress = new Address("123 Main Street", "London", "E1 1Ea", "UK");

        Address customerAddress1 = new Address("456 Elm Street", "London", "SW1 1Ra", "UK");



        Node hubA = new Node("N1", "Hub A", hubAddress);




        Graph graph = new Graph();

        // Create nodes
        Node nodeA = new Node("A", "A", customerAddress1);

        Node nodeB = new Node("B", "B", customerAddress2);



        // Create edges
        Edge edgeAB = new Edge(nodeA, nodeB, 10);


        // Add edges to the graph
        graph.list.put(nodeA, List.of(edgeAB, edgeAC));

        // Display the graph
        System.out.println("Graph Representation:");
        System.out.println(graph.displayGraph());







        }
    }
