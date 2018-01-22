public class Class
{
    public static void main(String[] args)
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.Hello();
        // SetValue
        helloWorld.SetAge(25);
        helloWorld.Hello();
    }
}

class HelloWorld
{
    public String name;
    public int age;

    // constructor
    public HelloWorld()
    {
        name = "ShuaiZhan";
        age = 24;
    }

    public void Hello()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public void SetAge(int value)
    {
        age = value;
    }
}