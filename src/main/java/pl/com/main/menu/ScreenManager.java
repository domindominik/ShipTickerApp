package pl.com.main.menu;

import pl.com.main.cruise.CruiseScreen;
import pl.com.main.cruise.CruiseStatusScreen;
import pl.com.main.port.Port;

public class ScreenManager
{
    private static Port port = new Port("AMSTERDAM");
    MainScreen mainScreen = new MainScreen();
    CruiseScreen cruiseScreen = new CruiseScreen(port);
    CruiseStatusScreen cruiseStatusScreen = new CruiseStatusScreen(port);

    public ScreenManager()
    {

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

        return mainScreen.interact();
    }


}
