package pl.com.main.ship;

import pl.com.main.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ship implements Serializable
{
    private String name;
    private int space;
    private List<Human> humanList;

    public Ship(String name)
    {
        this.name = name;
        this.space = 1000;
        this.humanList = new ArrayList<>();
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

    @Override
    public String toString()
    {
        return "Name: " + name + " Space: " + space;
    }
}
