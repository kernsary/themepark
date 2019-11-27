package stalls;

import people.Visitor;

public class CandyflossStall extends Stall {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }
    public boolean isAllowedTo(Visitor visitor){
        return true;
    }
}
