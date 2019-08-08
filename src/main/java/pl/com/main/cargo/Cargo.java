package pl.com.main.cargo;

import java.io.Serializable;

public class Cargo implements Serializable
{
    private int volume;
    private int price;
    public static final int spaceunit = 5;

    public Cargo(int volume)
    {
        this.volume = volume;
    }

    public int getVolume()
    {
        return volume;
    }

    public int getPrice()
    {
        return price;
    }

    public static int getSpaceunit()
    {
        return spaceunit;
    }
}
