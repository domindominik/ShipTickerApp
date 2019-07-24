package pl.com.main.cruise;

import pl.com.main.menu.Screen;
import pl.com.main.menu.ScreenManager;
import pl.com.main.port.Port;
import pl.com.main.ship.Ship;

import java.util.Scanner;

public class CruiseScreen implements Screen
{
    private Cruise cruise;
    private Port port;

    public CruiseScreen()
    {
        this.cruise = cruise;
        this.port = port;
    }

    @Override
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create cruise \n Enter ship name: ");
        String name = scanner.next();
        System.out.println("Enter destination: ");
        String destination = scanner.next();
        port.addCruise(new Cruise(destination, new Ship(name)));
        return 0;
    }
}
