package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice;

    public Dodgems(String name, int rating) {
        super(name, rating); this.defaultPrice = 4.50;
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return defaultPrice() / 2;
        }
        return defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor){
        return true;
    }


}
