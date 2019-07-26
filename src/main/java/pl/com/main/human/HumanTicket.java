package pl.com.main.human;

import pl.com.main.ticket.Ticket;

public class HumanTicket extends Ticket
{
    private Human human;

    public HumanTicket(Human human)
    {
        this.human = human;
    }

    @Override
    public int getPrice()
    {
        return human.getPrice();
    }
}
