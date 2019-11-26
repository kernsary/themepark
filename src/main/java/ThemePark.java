import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {

//    private Dodgems dodgems;
//    private Park park;
//    private Playground playground;
//    private RollerCoaster rollerCoaster;
//    private CandyflossStall candyflossStall;
//    private IceCreamStall iceCreamStall;
//    private TobaccoStall tobaccoStall;tobaccoStall
    private ArrayList<IReviewed> reviewedItems;

    public ThemePark(){
//        this.dodgems = new Dodgems("Crunk", 6);
//        this.park = new Park("Birdsong", 9);
//        this.playground = new Playground("Mania", 4);
//        this.rollerCoaster = new RollerCoaster("Whitey", 7);
//        this.candyflossStall = new CandyflossStall("GooMaster", "Orville Fillingsgone", ParkingSpot.A1, 3);
//        this.iceCreamStall = new IceCreamStall("PokyHats", "Icy Izzy", ParkingSpot.A4, 8);
//        this.tobaccoStall = new TobaccoStall("LungBusters", "Horace Hoarse", ParkingSpot.A2, 5);
        this.reviewedItems = new ArrayList<IReviewed>();
    }

    public void addItem(IReviewed item){
        reviewedItems.add(item);
    }

    public ArrayList<IReviewed>getAllReviewed(){
        return reviewedItems;
    }

}
