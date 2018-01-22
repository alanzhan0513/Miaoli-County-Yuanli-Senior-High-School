public class TryCatch
{
    public static void main(String[] args)
    {
        /*
        try
        {
            嘗試執行任務
        }
        catch (Exception ex)
        {
            如果上面的任務失敗，則會執行此處
        }
        finally 
        {
            不管怎樣都會被執行！
        }
        */
        
        String num = "123";
        String notNum = "HelloWorld";

        try 
        {
            Integer.parseInt(num);
            System.out.println(num + "is integer");
        } 
        catch (java.lang.NumberFormatException e) 
        {
            System.out.println(num + "in not integer");
        }

        try 
        {
            Integer.parseInt(notNum);
            System.out.println(notNum + "is integer");
        } 
        catch (java.lang.NumberFormatException e) 
        {
            System.out.println(notNum + "in not integer");
        }
    }
}