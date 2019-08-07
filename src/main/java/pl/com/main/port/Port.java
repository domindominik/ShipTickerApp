package pl.com.main.port;

import pl.com.main.cruise.Cruise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Port implements Serializable
{
    private String name;
    private List<Cruise> cruiseList;

    public Port(String name)
    {
        this.name = name;
        this.cruiseList = new ArrayList<>();
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCruiseList(List<Cruise> cruiseList) {
        this.cruiseList = cruiseList;
    }
}
