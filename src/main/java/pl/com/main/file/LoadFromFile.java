package pl.com.main.file;

import pl.com.main.menu.ScreenManager;
import pl.com.main.port.Port;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadFromFile
{
    private Port port;

    /*public LoadFromFile()
    {
        this.port = port;
    }*/

    public void loadFromFile()
    {
        try (FileInputStream fileInputStream = new FileInputStream(new File("port.dat")))
        {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
            {
                port = (Port) objectInputStream.readObject();
                System.out.println("ok");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
