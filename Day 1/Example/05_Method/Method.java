public class Method
{
    public static void main(String[] args)
    {
        // 呼叫 Hello 方法
        Hello();
        
        // 呼叫 World 方法，並且將 World 方法的回傳值，給world變數接起來！
        String world = World();
        System.out.println(world);

        // 呼叫 HelloHello 方法，並且將HelloHello變數傳遞！
        String HelloHello = "HelloHello";
        HelloHello(HelloHello);

        // 呼叫 WorldWorld 方法，並且將 WorldWorld 變數傳遞！
        int WorldWorld = 1;
        WorldWorld = WorldWorld(WorldWorld);
        System.out.println(WorldWorld);
    }

    public static void Hello()
    {
        System.out.println("Hello Called");
    }

    public static String World()
    {
        return "World"; 
    }

    public static void HelloHello(String HelloHello)
    {
        System.out.println(HelloHello);
    }

    public static int WorldWorld(int WorldWorld)
    {
        return WorldWorld += 2;
    }
}