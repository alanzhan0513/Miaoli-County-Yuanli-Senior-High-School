public class Scanner
{
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
 
        // Key in int
        System.out.println("key in int");
        int input1 = scanner.nextInt();
 
        // Key in double
        System.out.println("key in double");
        double input2 = scanner.nextDouble();
 
        // Key int boolean
        System.out.println("key in boolean");
        boolean input3 = scanner.nextBoolean();

        // Key in String
        System.out.println("key in String");
        String input4 = scanner.next();
 
        // Print
        System.out.println("int : " + input1);
        System.out.println("double : " + input2);
        System.out.println("boolean : " + input3);
        System.out.println("String : " + input4);
    }
}