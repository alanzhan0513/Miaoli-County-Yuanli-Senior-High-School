public class For
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        System.out.println("key in int:");
        int input = scanner.nextInt();
 
        /*
        for (1.宣告一個變數，並且賦值; 2.當條件成立的時候; 3.Do Something)
        {
            當條件成立時，此處會被執行！
            執行完畢後，會去執行第三個區塊！
        }
        */

        for (int i = input; i > 0; i--)
        {
            System.out.println("Hello!World!");
        }
    }
}