package pl.com.main.port;

import pl.com.main.cruise.Cruise;

import java.io.Serializable;
import java.util.List;

public class Port implements Serializable
{
    private String name;
    private List<Cruise> cruiseList;

    public Port(String name)
    {
        this.name = name;
        this.cruiseList = cruiseList;
    }

    public String getName()
    {
        return name;
    }

    public List<Cruise> getCruiseList()
    {
        return cruiseList;
    }

    public void addCruise(Cruise cruise)
    {
        cruiseList.add(cruise);
    }
}
