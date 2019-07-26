package pl.com.main.ship;

import pl.com.main.human.Human;
import pl.com.main.vehicle.car.Car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ship implements Serializable
{
    private String name;
    private int space;
    private List<Human> humanList;
    private List<Car> carList;

    public Ship(String name)
    {
        this.name = name;
        this.space = 1000;
        this.humanList = new ArrayList<>();
        this.carList = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public int getSpace()
    {
        return space;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpace(int space)
    {
        this.space = space;
    }

    public void addHuman(Human human)
    {
        space -= human.getPlace();
        humanList.add(human);
    }

    public void addCar(Car car)
    {
        carList.add(car);
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Space: " + space;
    }
}
