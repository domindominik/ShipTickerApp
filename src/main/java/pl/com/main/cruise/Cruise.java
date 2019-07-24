package pl.com.main.cruise;

import pl.com.main.ship.Ship;

import java.io.Serializable;

public class Cruise implements Serializable
{
    private String destination;
    private Ship ship;

    public Cruise(String destination, Ship ship)
    {
        this.destination = destination;
        this.ship = ship;
    }

    public String getDestination()
    {
        return destination;
    }

    public Ship getShip()
    {
        return ship;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
    }
}
