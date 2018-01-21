public class Switch
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        // 請輸入 int 型態的值
        System.out.println("Key in int");
        int input = scanner.nextInt();
 
        /*
        switch(變數/值)
        {
            case 值: // 當值相等時！
                Do Something
                break;
            
            case 值: // 當值相等時！
                Do Something
                break;

            default: // 如果上述都沒成立時！
                Do Something
                break;
        }
        */

        int i = input % 3;
        switch(i)
        {
            case 0: // 如果取餘數為0的話
                System.out.println("input % 3 = 0");
                break;

            case 1: // 如果取餘數為1的話
                System.out.println("input % 3 = 1");
                break;

            default: // 如果取餘數為2的話
                System.out.println("input % 3 = 2");
                break;
        }
    }
}