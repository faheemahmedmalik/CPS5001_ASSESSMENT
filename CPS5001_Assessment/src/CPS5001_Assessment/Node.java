package CPS5001_Assessment;


public class Node {
    private String id;
    private String name;
    private Address address;

    public Node(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;




    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + " (" + id + ") - " + address;
    }
}
