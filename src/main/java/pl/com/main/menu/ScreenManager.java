package pl.com.main.menu;

import pl.com.main.cruise.CruiseScreen;
import pl.com.main.cruise.CruiseStatusScreen;
import pl.com.main.file.LoadFromFileScreen;
import pl.com.main.file.SaveToFileScreen;
import pl.com.main.human.HumanScreen;
import pl.com.main.port.Port;

public class ScreenManager
{
    //private Port port;
    private static Port port = new Port("AMSTERDAM");
    MainScreen mainScreen = new MainScreen();
    TicketMenuScreen ticketMenuScreen = new TicketMenuScreen();

    CruiseScreen cruiseScreen = new CruiseScreen(port);
    CruiseStatusScreen cruiseStatusScreen = new CruiseStatusScreen(port);
    SaveToFileScreen saveToFileScreen = new SaveToFileScreen(port);
    LoadFromFileScreen loadFromFileScreen = new LoadFromFileScreen(port);
    HumanScreen humanScreen = new HumanScreen(port);

    public ScreenManager()
    {
        //this.port = new Port("AMSTERDAM");
        this.port = port;
    }

    int chosenScreen;
    public void manager()
    {
        chosenScreen = 0;
        while (true)
        {
            chosenScreen = chosenScreen(chosenScreen);
        }
    }

    private int chosenScreen(int chosenScreen)
    {
        if (chosenScreen == 0)
        {
            return mainScreen.interact();
        }

        if (chosenScreen == 1)
        {
            return cruiseScreen.interact();
        }

        if (chosenScreen == 2)
        {
            return cruiseStatusScreen.interact();
        }

        if (chosenScreen == 3)
        {
            return saveToFileScreen.interact();
        }

        if (chosenScreen == 4)
        {
            return loadFromFileScreen.interact();
        }

        if (chosenScreen == 5)
        {
            return ticketMenuScreen.interact();
        }

        if (chosenScreen == 6)
        {
            return humanScreen.interact();
        }

        return mainScreen.interact();
    }

    public static void setPort(Port port)
    {
        ScreenManager.port = port;
        //this.port = port;
    }
}
