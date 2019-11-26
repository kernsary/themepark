import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewedItems;

    public ThemePark(){
        this.reviewedItems = new ArrayList<>();
    }

    public void addItem(IReviewed item){
        reviewedItems.add(item);
    }

    public ArrayList<IReviewed>getAllReviewed(){
        return reviewedItems;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addAttraction(attraction);
    }

}
