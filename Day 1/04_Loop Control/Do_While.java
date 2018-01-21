public class Do_While
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        /*
        do
        {
            此處會被執行！
        } while(當條件式成立！做上面的事情！);
        */

        int input = 0;
        do
        {
            System.out.println("key in number");
            input = scanner.nextInt();
        } while (input != 30); // 當條件成立，就會下一次迴圈！
 
        // 如果上面條件失敗，就會到此處！
        System.out.println("Congratulations");
    }
}