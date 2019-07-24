package pl.com.main.menu;

import pl.com.main.port.Port;

public class ScreenManager
{
    private static Port port = new Port("AMSTERDAM");
    MainScreen mainScreen = new MainScreen();

    public ScreenManager()
    {

    }

    public void manager()
    {
        int chosenScreen = 0;
        while (true)
        {
            chosenScreen = chosenScreen(chosenScreen);
        }
    }

    private int chosenScreen(int chosenScreen)
    {
        return mainScreen.interact();
    }


}
