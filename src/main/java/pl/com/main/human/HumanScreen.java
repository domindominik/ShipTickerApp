package pl.com.main.human;

import pl.com.main.menu.Screen;
import pl.com.main.port.Port;
import pl.com.main.ticket.Ticket;

import java.util.Scanner;

public class HumanScreen implements Screen
{
    private Port port;

    public HumanScreen(Port port)
    {
        this.port = port;
    }

    @Override
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter surname: ");
        String surname = scanner.next();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        Human human = new Human(name, surname, age);

        if (port.getCruiseList().get(0).getShip().getSpace() >= human.getPlace())
        {
            Ticket ticket = new HumanTicket(human);
            System.out.println("Ticket price: " + human.getPrice());
            System.out.println(ticket.getPrice());
            port.getCruiseList().get(0).getShip().addHuman(human);
        }
        else
        {
            System.out.println("Not enough space");
        }

        return 5;
    }
}
