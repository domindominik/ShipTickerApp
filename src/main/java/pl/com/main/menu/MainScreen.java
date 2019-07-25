package pl.com.main.menu;

import java.util.Scanner;

public class MainScreen implements Screen
{

    @Override
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add cruise, 2. Cruise status, 3. Save");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
                return 1;

            case 2:
                return 2;

            case 3:
                return 3;
        }
        return 0;
    }
}
