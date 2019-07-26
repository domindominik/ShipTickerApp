package pl.com.main.human;

import java.io.Serializable;

public class Human implements Serializable
{
    private String name;
    private String surname;
    private int age;
    private int price;
    private int place;
    /*public static final int place = 10;
    public static final int child = 5;*/

    public Human(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.price = price(age);
        this.place = place(age);
    }

    public int price(int age)
    {
        if (age < 3)
        {
            return 0;
        }
        if (age < 18)
        {
            return 5;
        }
        if (age < 70)
        {
            return 10;
        }
        return 5;
    }

    public int place(int age)
    {
        if (age < 18)
        {
            return 5;
        }
        return 10;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Surname: " + surname + " Age: " + age + " Price: " + price + " Place: " + place;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }

    public int getPrice()
    {
        return price;
    }

    public int getPlace()
    {
        return place;
    }

    public void setPrice()
    {
        this.price = price;
    }

}
