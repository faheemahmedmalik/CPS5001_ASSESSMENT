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


        // Create DeliveryScheduler and predefined vans
        DeliveryScheduler scheduler = terminal.getScheduler();
        Van van1 = new Van("V1", 100);
        Van van2 = new Van("V2", 200);
        Van van3 = new Van("V3", 150);
        Van van4 = new Van("V4", 150); // Additional van for handling more parcels
        scheduler.addVan(van1);
        scheduler.addVan(van2);
        scheduler.addVan(van3);
        scheduler.addVan(van4);

        // Display predefined vans
        System.out.println("\n=== Predefined Vans ===");
        System.out.println(van1);
        System.out.println(van2);
        System.out.println(van3);
        System.out.println(van4);

        // Add predefined parcels
        scheduler.addParcel(new Parcel("P1", customerB, 20, 5)); // Parcel to Customer B
        scheduler.addParcel(new Parcel("P2", customerC, 30, 10)); // Parcel to Customer C
        scheduler.addParcel(new Parcel("P3", customerE, 40, 15)); // Parcel to Customer E
        scheduler.addParcel(new Parcel("P4", customerE, 50, 20)); // Parcel to Customer E
        scheduler.addParcel(new Parcel("P5", customerE, 25, 8));  // Parcel to Customer E
        scheduler.addParcel(new Parcel("P6", customerB, 35, 18)); // Parcel to Customer B
        scheduler.addParcel(new Parcel("P7", customerB, 45, 25)); // Parcel to Customer B
        scheduler.addParcel(new Parcel("P8", customerC, 15, 12)); // Parcel to Customer C

        // Display predefined parcels
        System.out.println("\n=== Predefined Parcels ===");
        for (int i = 1; i <= 8; i++) {
            System.out.println("Parcel P" + i);
        }

        // Schedule parcels
        System.out.println("\n=== Scheduling Parcels ===");
        scheduler.scheduleParcels(hubA);

        // Display final delivery schedule
        System.out.println("\n=== Final Delivery Schedule ===");
        scheduler.displaySchedule();














        }
    }
