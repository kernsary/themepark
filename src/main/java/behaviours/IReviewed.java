package behaviours;

import people.Visitor;

public interface IReviewed {

    public int getRating();

    public String getName();

    public boolean isAllowedTo(Visitor visitor);
}
