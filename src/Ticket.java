import java.util.Date;

public class Ticket {
    private static int idCounter=0;
    private int id;
    private String owner;
    private Date bookingTime;
    private int numberOfSeats;
    private Show bookedShow;

    public Ticket() {
        idCounter += 1;
        this.id = idCounter;
    }
    public Ticket(int id, String ownerName, Date bookingTime, int noOfSeats, Show bookedShow) {
        this.id = id;
        this.owner = ownerName;
        this.bookingTime = bookingTime;
        this.numberOfSeats = noOfSeats;
        this.bookedShow = bookedShow;
    }
    public String getTicketInfo(){
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String ownerName) {
        this.owner = ownerName;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int noOfSeats) {
        this.numberOfSeats = noOfSeats;
    }

    public Show getBookedShow() {
        return bookedShow;
    }

    public void setBookedShow(Show bookedShow) {
        this.bookedShow = bookedShow;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "owner='" + owner + '\'' +
                ", bookingTime=" + bookingTime +
                ", numberOfSeats=" + numberOfSeats +
                ", bookedShow=" + bookedShow +
                '}';
    }
}
