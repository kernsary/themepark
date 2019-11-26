package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(6, tobaccoStall.getRating());
    }

    @Test
    public void visitor18OrOverCanVisit(){
        Visitor visitor = new Visitor(18, 2, 20);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitorUnder18CannotVisit(){
        Visitor visitor = new Visitor(17, 2, 20);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}
