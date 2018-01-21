public class IfElse
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        // 請輸入 int 型態的值
        System.out.println("Key in int");
        int input = scanner.nextInt();
 
        /*
        if (條件成立時)
        {
            Do Something
        }
        else if (條件成立時)
        {
            Do Something
        }
        else
        {
            上述條件都不成立時！
            Do Something
        }
        */

        if (input % 3 == 0) // 如果取餘數為0的話
        {
            System.out.println("input % 3 = 0");
        }
        else if (input % 3 == 1) // 如果取餘數為1的話
        {
            System.out.println("input % 3 = 1");
        }
        else // 如果取餘數為2的話
        {
            System.out.println("input % 3 = 2");
        }
    }
}