package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorOldAndTallEnoughCanVisit(){
        Visitor visitor = new Visitor(15, 1.5, 20);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotTallEnoughCannotVisit(){
        Visitor visitor = new Visitor(15, 1.4, 20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotOldEnoughCannotVisit(){
        Visitor visitor = new Visitor(11, 1.5, 20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorUnder2mChargedDefaultPrice(){
        Visitor visitor = new Visitor(11, 1.5, 20);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void visitorOver2mChargedDoublePrice(){
        Visitor visitor = new Visitor(11, 2.1, 20);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }

}
