import attractions.*;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Integer> getReviews(){
        HashMap<String, Integer> reviews = new HashMap<>();
        for(IReviewed item : reviewedItems){
            reviews.put(item.getName(), item.getRating());
        }
        return reviews;
    }

    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor){
        ArrayList<IReviewed> allowedItems = new ArrayList<>();
        for(IReviewed item : reviewedItems){
            if(item.isAllowedTo(visitor)){
                allowedItems.add(item);
            }
        }
        return allowedItems;
    }

}
