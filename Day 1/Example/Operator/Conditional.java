public class Conditional
{
    public static void main(String[] args)
    {
        int i = 2;
        int j = 3;
        int k = 4;
 
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);
 
        // && 運算
        System.out.println(" i < j && i < k " + ((i < j) && (i < k)));
 
        // || 運算
        System.out.println(" i < j || k > j " + ((i < j) || (k > j)));
 
        // ! 運算
        System.out.println(" !(i < j) " + (!(i < j)));
    }
}