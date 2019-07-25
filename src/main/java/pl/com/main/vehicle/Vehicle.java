package pl.com.main.vehicle;

import pl.com.main.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle implements Serializable
{
    private List<Human> humanList;
    private int price;

    public Vehicle()
    {
        this.humanList = new ArrayList<>();
        this.price = price;
    }

    public List<Human> getHumanList()
    {
        return humanList;
    }

    public int getPrice()
    {
        return price;
    }

    public void setHumanList(List<Human> humanList)
    {
        this.humanList = humanList;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
