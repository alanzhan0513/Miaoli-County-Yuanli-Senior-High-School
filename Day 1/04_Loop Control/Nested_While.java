public class Nested_While
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        System.out.println("key in width");
        int length = scanner.nextInt();
 
        System.out.println("key in length");
        int width = scanner.nextInt();
 
        int widthCount = 0;
        while (widthCount < width)
        {
            int lengthCount = 0;
            while (lengthCount < length)
            {
                System.out.print("*");
                lengthCount++;
            }
 
            System.out.println(); // 換行
            widthCount++;
        }
    }
}