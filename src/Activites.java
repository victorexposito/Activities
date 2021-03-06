// import java.persistence.Entity;
// import java.persistence.Id;


//@Entity
public class Activites {

    //@Id
    private int activity_id;
    private int price;
    private String name;
    private int duration;

    public Activites(int activity_id, int price, String name, int duration) {
        this.activity_id = activity_id;
        this.price = price;
        this.name = name;
        this.duration = duration;
    }

    public Activites() {
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
