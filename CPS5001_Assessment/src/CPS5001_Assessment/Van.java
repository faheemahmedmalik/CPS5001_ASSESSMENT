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








}
