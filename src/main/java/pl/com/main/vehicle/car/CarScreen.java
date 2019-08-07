package pl.com.main.vehicle.car;

import pl.com.main.human.Human;
import pl.com.main.menu.Screen;
import pl.com.main.port.Port;
import pl.com.main.ticket.Ticket;

import java.util.Scanner;

public class CarScreen implements Screen
{
    private Port port;

    public CarScreen(Port port)
    {
        this.port = port;
    }

    @Override
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of passengers");
        int quantityPassengers = scanner.nextInt();
        Car car = new Car();

        for (int i = 0; i < quantityPassengers; i++)
        {
            System.out.println("Enter name: ");
            String name = scanner.next();
            System.out.println("Enter surname: ");
            String surname = scanner.next();
            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            Human human = new Human(name, surname, age);
            car.addHumane(human);
        }

        Ticket ticket = new CarTicket(car);

        System.out.println("Ticket price: " + car.getPrice());
        port.getCruiseList().get(0).getShip().addCar(car);

        return 5;
    }
}
