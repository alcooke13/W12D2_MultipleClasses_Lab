import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        int maxCapacity = this.capacity;
        if(this.passengers.size() < maxCapacity){
        this.passengers.add(person);
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUpPassenger(BusStop busStop){
        Person person = busStop.removePersonFromQueue();
        this.passengers.add(person);
    }

}
