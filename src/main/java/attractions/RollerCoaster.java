package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double defaultPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 8.40;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getHeight() > 1.45 && visitor.getAge() > 11){
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 2){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
