import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Stop A");
        person = new Person();
    }

    @Test
    public void queueStartsAt0(){
        assertEquals(0, busStop.countQueue());
    }


    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.countQueue());
    }

}
