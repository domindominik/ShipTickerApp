package pl.com.main.cargo;

import pl.com.main.menu.Screen;
import pl.com.main.port.Port;
import pl.com.main.ticket.Ticket;

import java.util.Scanner;

public class CargoScreen implements Screen
{
    private Port port;

    public CargoScreen(Port port)
    {
        this.port = port;
    }

    @Override
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cargo volume");
        int volume = scanner.nextInt();
        Cargo cargo = new Cargo(volume);

        Ticket ticket = new CargoTicket(cargo);
        System.out.println("Ticket price: " + cargo.getPrice());
        port.getCruiseList().get(0).getShip().addCargo(cargo, volume);

        return 5;
    }
}
