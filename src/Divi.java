import java.util.Scanner;
class Test
{
    public static void main(String[ ] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int a= sc.nextInt();
        if(a%8==0)
        {
            System.out.println("Provided number "+ a + "is divisible by 8");
        }
        else
        {
            System.out.println("Provided number is " + a+ "is not divisible");
        }
    }
}
