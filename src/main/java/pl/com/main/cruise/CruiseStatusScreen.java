package pl.com.main.cruise;

import pl.com.main.menu.Screen;
import pl.com.main.port.Port;

public class CruiseStatusScreen implements Screen
{
    private Port port;

    public CruiseStatusScreen(Port port)
    {
        this.port = port;
    }

    @Override
    public int interact()
    {
        System.out.println(port.getCruiseList().size());
        for (Cruise cruise: port.getCruiseList())
        {
            System.out.println(cruise.getShip().toString() + " Destination: " + cruise.getDestination());
        }
        return 0;
    }
}
