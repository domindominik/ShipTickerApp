package pl.com.main.menu;

import java.util.Scanner;

public class TicketMenuScreen implements Screen
{
    @Override
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Human, 2. Car, 3. Motor, 4. Bus, 5. Truck, Exit 0");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
                return 6;

            case 2:
                return 7;

            case 3:
                return 8;

            case 4:
                return 9;

            case 5:
                return 10;

            case 0:
                return 0;
        }
        return 5;
    }
}
