package pl.com.main.human;

public class Human
{
    private String name;
    private String surname;
    private int age;
    private int price;
    public static final int adult = 10;
    public static final int child = 5;

    public Human(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Surname: " + surname + " Age: " + age;
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


}
