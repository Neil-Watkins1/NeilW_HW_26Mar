public class TobaccoStall extends Stall implements ISecurity, IReviewed{

    public TobaccoStall(String name, String owner, int parkingSpace, int rating) {
        super(name, owner, parkingSpace, rating);

    }

public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 18)
    {return true;}
        else {
            return false;
        }


    }


}
