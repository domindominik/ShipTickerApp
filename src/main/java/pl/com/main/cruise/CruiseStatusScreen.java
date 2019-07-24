package pl.com.main.cruise;

import pl.com.main.menu.Screen;
import pl.com.main.port.Port;

public class CruiseStatusScreen implements Screen
{
    private Port port;

    public CruiseStatusScreen()
    {
        this.port = port;
    }

    @Override
    public int interact()
    {
        for (Cruise cruise: port.getCruiseList())
        {
            cruise.getShip().toString();
        }
        return 0;
    }
}
