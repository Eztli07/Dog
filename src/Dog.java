public class Dog
{
    private String name;

    private int age;

    private String breed;

    private double pounds;

    private static int getNumDogs;

    public Dog(String MyName, int MyAge, String MyBreed, double MyPounds)
    {
        this.name = MyName;

        this.age = MyAge;

        this.breed = MyBreed;

        this.pounds = MyPounds;

        getNumDogs++;
    }

    public Dog()
    {
        name = "name goes here";
        breed = "none";
        pounds = 0.0;
        age = 0;
        getNumDogs++;
    }

    public double converter()
    {
        return pounds * 0.453592;
    }

    public static int getCountDogs()
    {
        return getNumDogs;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public double getPounds()
    {
        return pounds;
    }

    public String toString()
    {
        String output = "\n Name: " + name + "\n Age: "
                + age + "\n Breed: " + breed + "\n Weight (Pounds): " + pounds + "\n Weight (Kilograms): " +  converter();
        return output;
    }}
