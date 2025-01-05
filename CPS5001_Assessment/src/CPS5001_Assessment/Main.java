package CPS5001_Assessment;


public class Main {
    public static void main(String[] args) {

        CityLogisticsTerminal terminal = new CityLogisticsTerminal();


        Address hubAddress = new Address("123 Main Street", "London", "E1 1Ea", "UK");
        Address customerAddress1 = new Address("456 Elm Street", "London", "SW1 1Ra", "UK");
        Address customerAddress2 = new Address("789 Oak Avenue", "London", "SW12 5BA", "UK");
        Address customerAddress3 = new Address("692 Waldegrave Rd","London", "TW1 4SX"  , "UK");
        Address customerAddress4 = new Address("12 Milverton Rd", "London", "NW1 1AA", "UK");


        // Predefined Node objects
        Node hubA = new Node("N1", "Hub A", hubAddress);
        Node customerB = new Node("N2", "Customer B", customerAddress1);
        Node customerC = new Node("N3", "Customer C", customerAddress2);
        Node StmarysUniversity = new Node("N4", "StmarysUniversity", customerAddress3);
        Node customerE = new Node("N5", "Customer E", customerAddress4);


        // Add  nodes to the graph
        terminal.getGraph().addNode(hubA);
        terminal.getGraph().addNode(customerB);
        terminal.getGraph().addNode(customerC);
        terminal.getGraph().addNode(StmarysUniversity);
        terminal.getGraph().addNode(customerE);

        // Add  edges to the graph
        terminal.getGraph().addEdge(hubA, customerB, 10, 0); // Hub A -> Customer B
        terminal.getGraph().addEdge(hubA, customerC, 15, 0); // Hub A -> Customer C
        terminal.getGraph().addEdge(customerB, customerC, 7, 0); // Customer B -> Customer C
        terminal.getGraph().addEdge(customerC,StmarysUniversity,5,0.25); // Customer c to Customer D
        terminal.getGraph().addEdge(StmarysUniversity,customerE,4,0.5);// Customer D to Customer E

        // Display the  graph
        System.out.println("=== Predefined Graph Loaded ===");
        System.out.println(terminal.getGraph().displayGraph());






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
