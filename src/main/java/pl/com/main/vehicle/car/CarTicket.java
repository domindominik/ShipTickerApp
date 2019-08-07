package pl.com.main.vehicle.car;

import pl.com.main.ticket.Ticket;

public class CarTicket extends Ticket
{
    private Car car;

    public CarTicket(Car car)
    {
        this.car = car;
    }

    @Override
    public int getPrice()
    {
        return car.getPrice();
    }
}
