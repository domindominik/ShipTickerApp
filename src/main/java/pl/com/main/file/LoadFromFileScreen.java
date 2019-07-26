package pl.com.main.file;

import pl.com.main.menu.Screen;
import pl.com.main.menu.ScreenManager;
import pl.com.main.port.Port;

public class LoadFromFileScreen implements Screen
{
    private Port port;

    public LoadFromFileScreen(Port port)
    {
        this.port = port;
    }

    @Override
    public int interact()
    {
        LoadFromFile loadFromFile = new LoadFromFile(port);
        loadFromFile.loadFromFile();
        return 0;
    }
}
