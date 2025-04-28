import java.util.ArrayList;
import java.util.Scanner;

class Agent {
    int agentId;
    String name;
    String contact;

    Agent(int agentId, String name, String contact) {
        this.agentId = agentId;
        this.name = name;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Agent ID: " + agentId + ", Name: " + name + ", Contact: " + contact;
    }
}

class Property {
    int propertyId;
    int agentId;
    String address;
    double price;
    String status;

    Property(int propertyId, int agentId, String address, double price, String status) {
        this.propertyId = propertyId;
        this.agentId = agentId;
        this.address = address;
        this.price = price;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Property ID: " + propertyId + ", Agent ID: " + agentId + ", Address: " + address +
                ", Price: " + price + ", Status: " + status;
    }
}

public class real{
    private static ArrayList<Agent> agents = new ArrayList<>();
    private static ArrayList<Property> properties = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nReal Estate Agent Management System");
            System.out.println("1. Add Agent");
            System.out.println("2. Add Property");
            System.out.println("3. View Agents");
            System.out.println("4. View Properties");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addAgent();
                case 2 -> addProperty();
                case 3 -> viewAgents();
                case 4 -> viewProperties();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
    }

    private static void addAgent() {
        System.out.print("Enter Agent ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Agent Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Agent Contact: ");
        String contact = scanner.nextLine();

        agents.add(new Agent(id, name, contact));
        System.out.println("Agent added successfully!");
    }

    private static void addProperty() {
        System.out.print("Enter Property ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Agent ID: ");
        int agentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Property Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Property Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Property Status (Available/Sold): ");
        String status = scanner.nextLine();

        properties.add(new Property(id, agentId, address, price, status));
        System.out.println("Property added successfully!");
    }

    private static void viewAgents() {
        if (agents.isEmpty()) {
            System.out.println("No agents available.");
        } else {
            for (Agent agent : agents) {
                System.out.println(agent);
            }
        }
    }

    private static void viewProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
        } else {
            for (Property property : properties) {
                System.out.println(property);
            }
        }
    }
}