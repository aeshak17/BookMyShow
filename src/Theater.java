import java.util.ArrayList;

public class Theater {
    private  int id;
    private String name;
    private String location;
    private int capacity;
    private ArrayList<Show> show;

    public Theater(int id, String name, String location, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.show = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
