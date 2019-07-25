package pl.com.main.file;

import pl.com.main.port.Port;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveToFile
{
    private Port port;

    public SaveToFile(Port port)
    {
        this.port = port;
    }

    public void saveToFile()
    {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("port.dat")))
        {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
            {
                objectOutputStream.writeObject(port);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
