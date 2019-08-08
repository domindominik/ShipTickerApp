package pl.com.main.cargo;

import pl.com.main.ticket.Ticket;

public class CargoTicket extends Ticket
{
    private Cargo cargo;

    public CargoTicket(Cargo cargo)
    {
        this.cargo = cargo;
    }

    @Override
    public int getPrice()
    {
        return cargo.getPrice();
    }
}
