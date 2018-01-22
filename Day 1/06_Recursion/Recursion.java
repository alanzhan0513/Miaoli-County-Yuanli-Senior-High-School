public class Recursion
{
    public static void main(String[] args)
    {
        int i = 10;
        int result = recursion(i);
        System.out.println(result);
    }

    public static int recursion(int r) 
    {
        if (r > 1)
        { 
            return r + recursion(r - 1); 
        }
        else
        { 
            return r; 
        }
    }
}