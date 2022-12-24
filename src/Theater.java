import java.util.ArrayList;
import java.util.Calendar;

public class Theater {
    private static int idCounter=0;
    private  int id;
    private String name;
    private String location;
    private int capacity;
    private ArrayList<Show> show;

    public Theater( String name, String location, int capacity) {
        idCounter += 1;
        this.id = idCounter;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.show = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Show> getShow() {
        return show;
    }

    public void setShow(ArrayList<Show> show) {
        this.show = show;
    }

    public ArrayList<Show> getShows() {
        return show;
    }
}
