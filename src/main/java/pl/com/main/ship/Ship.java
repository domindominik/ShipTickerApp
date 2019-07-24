package pl.com.main.ship;

import java.io.Serializable;

public class Ship implements Serializable
{
    private String name;
    private int space;

    public Ship(String name)
    {
        this.name = name;
        this.space = 1000;
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
