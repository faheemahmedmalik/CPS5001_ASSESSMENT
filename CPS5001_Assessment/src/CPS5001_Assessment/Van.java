package CPS5001_Assessment;
 import java.util.ArrayList;
 import java.util.List;


public class Van {

    private String id;
    private double capacity;
    private double currentLoad;
    private List<Parcel> parcels;


    public Van(String id, double capacity) {
        this.id = id;
        this.capacity = capacity;
        this.currentLoad = 0;
        this.parcels = new ArrayList<>();
    }

    public String getId() {
        return id;}


    public double getCapacity() {
        return capacity;}


    public double getCurrentLoad() {
        return currentLoad;
    }


    public boolean canAccommodate(double weight) {
        return currentLoad + weight <= capacity;}


    public void addParcel(Parcel parcel) {
        if (canAccommodate(parcel.getWeight())) {
            parcels.add(parcel);
            currentLoad += parcel.getWeight();
        } else {
            throw new IllegalArgumentException("Parcel exceeds van capacity");
        }
    }


    public List<Parcel> getParcels() {
        return parcels;
    }



    public String toString() {
        return "Van{id='" + id + "', capacity=" + capacity +
                ", currentLoad=" + currentLoad + ", parcels=" + parcels + '}';
    }




















}
