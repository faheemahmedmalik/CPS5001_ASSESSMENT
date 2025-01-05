package CPS5001_Assessment;

import java.util.Scanner;

public class CityLogisticsTerminal {
    private Graph graph = new Graph();
    private DeliveryScheduler scheduler = new DeliveryScheduler(graph);

    public Graph getGraph() {
        return graph;
    }

    public DeliveryScheduler getScheduler() {
        return scheduler;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== City Logistics System ===");
            System.out.println("1. Add Node");
            System.out.println("2. Add Edge");
            System.out.println("3. Add Van");
            System.out.println("4. Add Parcel");
            System.out.println("5. Schedule Parcels");
            System.out.println("6. Display Schedule");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> addNode(scanner);
                case 2 -> addEdge(scanner);
                case 3 -> addVan(scanner);
                case 4 -> addParcel(scanner);
                case 5 -> {
                    Node startNode = getStartNode();
                    scheduler.scheduleParcels(startNode);
                }
                case 6 -> scheduler.displaySchedule();
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private Node getStartNode() {
        // Assuming we use a predefined node as the start hub
        return new Node("N1", "Hub A", null); // Use the real predefined node if available
    }

    private void addNode(Scanner scanner) {
        System.out.print("Enter Node ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Node Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address (Street): ");
        String street = scanner.nextLine();
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        System.out.print("Enter Postal Code: ");
        String postalCode = scanner.nextLine();
        System.out.print("Enter Country: ");
        String country = scanner.nextLine();

        Address address = new Address(street, city, postalCode, country);
        graph.addNode(new Node(id, name, address));
        System.out.println("Node added successfully.");
    }


    private void addEdge(Scanner scanner) {
        System.out.print("Enter Source Node ID: ");
        String sourceId = scanner.nextLine();
        System.out.print("Enter Destination Node ID: ");
        String destId = scanner.nextLine();
        System.out.print("Enter Distance: ");
        double distance = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Congestion Level: ");
        double congestion = Double.parseDouble(scanner.nextLine());

        Node source = new Node(sourceId, sourceId, null);
        Node destination = new Node(destId, destId, null);
        graph.addEdge(source, destination, distance, congestion);
        System.out.println("Edge added successfully.");
    }

    private void addVan(Scanner scanner) {
        System.out.print("Enter Van ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Van Capacity: ");
        double capacity = Double.parseDouble(scanner.nextLine());
        scheduler.addVan(new Van(id, capacity));
        System.out.println("Van added successfully.");
    }

    private void addParcel(Scanner scanner) {
        System.out.print("Enter Parcel ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Destination Node ID: ");
        String nodeId = scanner.nextLine();
        System.out.print("Enter Parcel Weight: ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Parcel Deadline: ");
        double deadline = Double.parseDouble(scanner.nextLine());
        Node destination = new Node(nodeId, nodeId, null);
        scheduler.addParcel(new Parcel(id, destination, weight, deadline));
        System.out.println("Parcel added successfully.");
    }












}

