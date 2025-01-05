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












}

