public class Two_Dimensional_Array
{
    public static void main(String[] args)
    {
        int[][] ninenine = new int[9][9];

        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                ninenine[i][j] = (i+1)*(j+1);
            }
        }

        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                System.out.println((i+1) + " * " + (j+1) + " = " + ninenine[i][j]);
            }
        }
    }
}