import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    private BusStop busStop;

    @Before
    public void before(){
    bus = new Bus("Edinburgh", 2);
    person = new Person();
    busStop = new BusStop("Stop A");
    busStop.addPersonToQueue(person);
    }

    @Test
    public void busPassengersStartAt0(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassengersToBus(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.getPassengerCount());
    }
    @Test
    public void cannotAddPassengerDueToCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.getPassengerCount());
    }

    @Test
    public void removeOnePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void canPickUpPassengerCheckBus(){
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void canPickUpPassengersCheckQueue(){
        bus.pickUpPassenger(busStop);
        assertEquals(0, busStop.countQueue());
    }

}
