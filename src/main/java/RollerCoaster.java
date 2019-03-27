public class RollerCoaster extends Attraction {

    private int minAge;
    private int minHeight;
    private int maxHeight;
    private int rating;

    public RollerCoaster(String name, int minAge, int minHeight, int maxHeight, int rating){
        super(name, rating);
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;

    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
