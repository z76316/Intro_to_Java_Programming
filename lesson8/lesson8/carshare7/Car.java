// BlueJ project: lesson8/carshare7

import java.util.ArrayList;

public class Car
{
    private ArrayList<Person> passengers;
    private int numberOfSeats;
    private String driverName;
    private int location;
    private int destination;

    public Car(String driverName, int numberOfSeats, int destination)
    {
        passengers = new ArrayList<Person>();
        this.driverName = driverName;
        this.numberOfSeats = numberOfSeats;
        location = 0;
        this.destination = destination;
    }

    /**
       Gets the name of this car's driver.
       @return the driver name
    */
    public String getDriverName()
    {
        return driverName;
    }

    /**
       Checks whether this car has arrived at its destination.
       @return true if the car has arrived
    */
    public boolean hasArrived()
    {
        return location == destination;
    }

    /**
       Tries to add a passenger.
       @param p the new passenger
       @return true if there is room in the car and the passenger's
       destination on the way to this car's destination
    */
    public boolean tryToAdd(Person p)
    {
        if (passengers.size() + 2 <= numberOfSeats
                && p.getDestination() <= destination)
        {
            passengers.add(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
       Drives this car to the next location and drops off
       any passengers whose destination is that location.
    */
    // TODO: Return a list of all passengers that get dropped off
    public ArrayList<Person> drive()
    {
        location++;
        int i = 0;
        ArrayList<Person> dropOffGuys = new ArrayList<Person>();
        while (i < passengers.size())
        {
            Person p = passengers.get(i);
            if (p.getDestination() == location)
            {
                dropOffGuys.add(p);
                // TODO: Remove print statement
                passengers.remove(i);
                
            }
            else
            {
                i++;
            }
        }
        return dropOffGuys;
    }
}
