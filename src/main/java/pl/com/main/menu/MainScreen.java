package pl.com.main.menu;

import java.util.Scanner;

public class MainScreen implements Screen
{

    @Override
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add cruise, 2. sth");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
                return 1;
        }
        return 0;
    }
}
