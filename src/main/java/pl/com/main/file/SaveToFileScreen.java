package pl.com.main.file;

import pl.com.main.menu.Screen;
import pl.com.main.port.Port;

public class SaveToFileScreen implements Screen
{
    private Port port;

    public SaveToFileScreen(Port port)
    {
        this.port = port;
    }

    @Override
    public int interact()
    {
        SaveToFile saveToFile = new SaveToFile(port);
        saveToFile.saveToFile();
        System.out.println("ok");
        return 0;
    }
}
