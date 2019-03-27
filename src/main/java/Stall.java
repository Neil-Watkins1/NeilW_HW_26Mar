public abstract class Stall implements IReviewed{

    private String name;
    private String owner;
    private int parkingSpace;
    private int rating;

    public Stall(String name, String owner, int parkingSpace, int rating){
        this.name = name;
        this.owner = owner;
        this.parkingSpace = parkingSpace;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(int parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public int getRating() {
        return rating;
    }
}
