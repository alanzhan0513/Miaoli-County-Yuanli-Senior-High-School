public class Break
{
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int score = 0;
        int sum = 0;
        int count = -1;
        while (true)
        {
            count++;
            sum += score;
            System.out.println("Key in value (-1 will be end):");
            score = scanner.nextInt();
 
            if (score == -1)
            {
                break;
            }
        }
        System.out.println("Average:" + (double) sum / count);
 
    }
}