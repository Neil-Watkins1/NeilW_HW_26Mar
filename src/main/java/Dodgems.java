public class Dodgems extends Attraction {


    private int minAge;
    private int minHeight;

    public Dodgems(String name, int minAge, int minHeight, int rating){
        super(name, rating);
        this.minAge = minAge;
        this.minHeight = minHeight;
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
}
