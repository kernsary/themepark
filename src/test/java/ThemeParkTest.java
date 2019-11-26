import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Crunk", 6);
        park = new Park("Birdsong", 9);
        playground = new Playground("Mania", 4);
        rollerCoaster = new RollerCoaster("Whitey", 7);
        candyflossStall = new CandyflossStall("GooMaster", "Orville Fillingsgone", ParkingSpot.A1, 3);
        iceCreamStall = new IceCreamStall("PokyHats", "Icy Izzy", ParkingSpot.A4, 8);
        tobaccoStall = new TobaccoStall("LungBusters", "Horace Hoarse", ParkingSpot.A2, 5);
        themePark.addItem(dodgems);
        themePark.addItem(park);
        themePark.addItem(playground);
        themePark.addItem(rollerCoaster);
        themePark.addItem(candyflossStall);
        themePark.addItem(iceCreamStall);
        themePark.addItem(tobaccoStall);
    }

    @Test
    public void hasReviewedArray(){
        assertEquals(7, themePark.getAllReviewed().size());
    }

    @Test
    public void visitorCanBeLogged(){
        Visitor visitor = new Visitor(25, 2, 300);
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
        assertEquals(1, dodgems.getVisitCount());
    }
}
