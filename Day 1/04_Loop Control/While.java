public class While
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        System.out.println("Key in int");
        int input = scanner.nextInt();
 
        /*
        while (當條件成立時)
        {
            此處會被執行！
        }
        */

        int count = 0;
        while (count < input) // 如果條件成立，則會執行！
        {
            System.out.println("Hello!World!");
            count++; // 每次執行後遞增
        }
    }
}