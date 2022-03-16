public class Rever{

    public static void main(String[] args)
    {
        int number= 9876,reverse=0;
        while(number!=0)
        {
            int a =number%10;
            reverse=reverse*10+a;
            number/=10;
        }
        System.out.println("Reversed Number is: " + reverse);
    }
}

