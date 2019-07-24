package pl.com.main;

import pl.com.main.menu.ScreenManager;

public class StartApp
{
    public static void start()
    {
        ScreenManager screenManager = new ScreenManager();
        screenManager.manager();
    }
    public static void main(String[] args)
    {
        start();
    }
}
